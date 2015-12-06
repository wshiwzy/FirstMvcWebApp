package com.zywu.mvn.mvc;

import com.zywu.mvn.pojo.Employee;
import com.zywu.mvn.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class HomeController {

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
	public @ResponseBody List<Employee> getemps() {

		List<Employee> employees = employeeService.getAllEmployees();
		employees.stream().forEach(r->r.setName("你好"));
		return employees;
	}
}
