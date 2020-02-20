package com.cts.employee.dao;

import java.util.List;

import com.cts.employee.model.Employee;

public interface EmployeeDao {
	
	boolean saveEmployee(Employee emp);
	

	// find product by Product Id
	Employee findById(String empId);

	List<Employee> findByName(String empName);

	// find all Products
	List<Employee> findAll();
}
