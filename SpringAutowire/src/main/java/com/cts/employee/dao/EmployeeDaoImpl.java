package com.cts.employee.dao;

import java.util.List;
import org.springframework.stereotype.Repository;

import com.cts.employee.model.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	public EmployeeDaoImpl(){
		System.out.println("----EmployeeDao Class object created---");
	}
	

	public boolean saveEmployee(Employee emp)
	{
		System.out.println("DAO: Employee " + emp.getEmpName() + " saved to Database...");
		// code to save product object into database
		return true;
	}
	
	public Employee findById(String empId)
	{
		return null;
	}
  
	public List<Employee> findByName(String empName)
    {
    	return null;
    }
	// find all Products
	public List<Employee> findAll(){
		return null;
	}

}
