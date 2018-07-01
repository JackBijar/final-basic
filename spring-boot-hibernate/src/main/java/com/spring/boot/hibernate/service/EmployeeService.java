package com.spring.boot.hibernate.service;

import java.util.List;

import com.spring.boot.hibernate.model.Employee;

public interface EmployeeService 
{

	public List<Employee> getEmployees();
	
	public Employee saveEmployee(Employee employee);

}
