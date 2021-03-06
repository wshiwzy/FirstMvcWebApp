package com.zywu.mvn.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zywu.mvn.pojo.Employee;

public interface EmployeeDao {
	Employee findEmployeeById(@Param(value="Id") long empId);

	Long addEmployee(Employee emp);

	void deleteEmployee(long empId);

	void updateEmployee(Employee emp);

	List<Employee> getAllEmployees();
}
