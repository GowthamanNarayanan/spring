package com.cts.employee.service;

import java.util.List;

import com.cts.employee.model.Employee;

public interface EmployeeService {
	// save employee
	boolean saveEmployee(Employee emp);
	

	Employee findById(String empId);

	List<Employee> findByName(String empName);

	List<Employee> findAll();

	
}
