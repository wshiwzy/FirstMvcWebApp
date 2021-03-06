package com.zywu.mvn.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zywu.mvn.dao.EmployeeDao;
import com.zywu.mvn.pojo.Employee;
import com.zywu.mvn.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;
	
	public Employee findEmployeeById(long empId) {
		return employeeDao.findEmployeeById(empId);
	}

	public Long addEmployee(Employee emp) {
		 employeeDao.addEmployee(emp);
		 return emp.getEmployeeId();
	}

	public void deleteEmployee(long empId) {
		employeeDao.deleteEmployee(empId);
		
	}

	public void updateEmployee(Employee emp) {
		employeeDao.updateEmployee(emp);
		
	}

	public List<Employee> getAllEmployees() {
		return employeeDao.getAllEmployees();
	}



}
