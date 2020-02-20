package com.cts.employee.controller;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.cts.employee.config.AppConfig;
import com.cts.employee.model.Employee;
import com.cts.employee.service.EmployeeService;
import com.cts.employee.service.EmployeeServiceImpl;

public class EmployeeController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Employee emp=new Employee();
		emp.setEmpId("1");
		emp.setEmpName("messi");
EmployeeService es =ac.getBean(EmployeeService.class);
es.saveEmployee(emp);


}
}
