package com.zywu.mvn.mvc;

import com.zywu.mvn.pojo.Employee;
import com.zywu.mvn.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

@Controller
public class HomeController {

    final static String FILEPATH = "/Users/john/Downloads/";

    @Autowired
    EmployeeService employeeService;

    @RequestMapping("/emp/{id}")
    public ModelAndView Index(@PathVariable String id) {

        ModelAndView mav = new ModelAndView("detail");

        Employee employee = employeeService
                .findEmployeeById(Long.parseLong(id));

        mav.addObject("employeeName", employee.getName());
        mav.addObject("age", employee.getAge());
        mav.addObject("enable", employee.isEnable());
        mav.addObject("address", employee.getAddress());
        mav.addObject("tel", employee.getTel());
        return mav;

    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ModelAndView Add(HttpServletRequest request) {

        ModelAndView mav = new ModelAndView();
        try {
            Employee employee = new Employee();
            employee.setAddress(request.getParameter("address"));
            employee.setAge(Integer.parseInt(request.getParameter("age")));
            employee.setEnable("on".equals(request.getParameter("enable")));
            employee.setName(request.getParameter("name"));
            employee.setTel(request.getParameter("tel"));

            Long empid = employeeService.addEmployee(employee);
            mav.setViewName("redirect:/emp/" + empid.toString());

        } catch (Exception e) {
            mav.setViewName("redirect:/emps");
        }
        return mav;
    }

    @RequestMapping(value = "/addfile", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> AddFile(HttpServletRequest request, @RequestParam("file") CommonsMultipartFile file) throws Exception {
        Map<String, Object> map = new HashMap<String, Object>();
        String savePath = request.getServletContext().getRealPath("/WEB-INF/upload/");
        //得到上传文件的保存目录，将上传的文件存放于WEB-INF目录下，不允许外界直接访问，保证上传文件的安全
        File fileDic = new File(savePath);
        //判断上传文件的保存目录是否存在
        if (!fileDic.exists() && !fileDic.isDirectory()) {
            System.out.println(savePath + "目录不存在，需要创建");
            //创建目录
            fileDic.mkdir();
        }

        if (!file.isEmpty()) {
            String filename = file.getOriginalFilename();
            File file1 = new File(savePath + filename);
            //防止重名
            while (file1.exists()) {
                filename = file.getOriginalFilename().substring(0, file.getOriginalFilename().lastIndexOf('.')) + (new Random().nextInt(100000) + 100000) + file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf('.'));
                file1 = new File(savePath + filename);
            }
            //创建一个文件输出流
            FileOutputStream out = new FileOutputStream(file1);

            //获取item中的上传文件的输入流
            InputStream in = file.getInputStream();

            //创建一个缓冲区
            byte buffer[] = new byte[1024];
            //判断输入流中的数据是否已经读完的标识
            int len = 0;
            //循环将输入流读入到缓冲区当中，(len=in.read(buffer))>0就表示in里面还有数据
            while ((len = in.read(buffer)) > 0) {
                //使用FileOutputStream输出流将缓冲区的数据写入到指定的目录(savePath + filename)当中
                out.write(buffer, 0, len);
            }
            //关闭输入流
            in.close();
            //关闭输出流
            out.close();
            //删除临时文件
            file.getFileItem().delete();
            map.put("success", true);
            map.put("imageUrl", savePath + filename);

        }
        return map;
    }

    @RequestMapping(value = "/addfile", method = RequestMethod.GET)
    public ModelAndView Addfile() {

        ModelAndView mav = new ModelAndView("fileupload");

        return mav;
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public ModelAndView Add() {

        ModelAndView mav = new ModelAndView("add");

        return mav;
    }

    @RequestMapping("/emps")
    public ModelAndView All() {


        ModelAndView mav = new ModelAndView("index");

        List<Employee> employees = employeeService.getAllEmployees();

        mav.addObject("employees", employees);
        return mav;

    }


    @RequestMapping(value = "/getemps", method = RequestMethod.GET)
    public
    @ResponseBody
    List<Employee> getemps() {

        List<Employee> employees = employeeService.getAllEmployees();
        employees.stream().forEach(r -> r.setName("你好"));
        return employees;
    }
}
