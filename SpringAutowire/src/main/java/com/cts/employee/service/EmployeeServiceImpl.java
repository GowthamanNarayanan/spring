package com.cts.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cts.employee.dao.EmployeeDao;
import com.cts.employee.model.Employee;


public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeDao empDao;
	@Override
	public boolean saveEmployee(Employee emp) {
		return empDao.saveEmployee(emp);
	}
@Override
	public Employee findById(String empId) {
		return empDao.findById(empId);
	}
@Override
	public List<Employee> findByName(String empName){
		return empDao.findByName(empName);
	}
@Override
	public List<Employee> findAll(){
		return empDao.findAll();
	}

}
