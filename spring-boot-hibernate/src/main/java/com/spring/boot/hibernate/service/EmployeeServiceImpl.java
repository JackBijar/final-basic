package com.spring.boot.hibernate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.boot.hibernate.dao.EmployeeDao;
import com.spring.boot.hibernate.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService
{
	@Autowired
	private EmployeeDao employeeDao;

	@Override
	public List<Employee> getEmployees()
	{
		return employeeDao.getEmployees();
	}

	@Override
	public Employee saveEmployee(Employee employee)
	{
		
		return  employeeDao.saveEmployee(employee);
	}

}
