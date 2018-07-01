package com.spring.boot.hibernate.dao;

import java.util.List;

import com.spring.boot.hibernate.model.City;
import com.spring.boot.hibernate.model.Country;
import com.spring.boot.hibernate.model.Employee;
import com.spring.boot.hibernate.model.State;

public interface EmployeeDao 
{

	public List<Employee> getEmployees();
	
	public Employee saveEmployee(Employee employee);
	
	public City getCity(Integer cityId);

	public Country getCountry(Integer countryId);

	public List<Country> getCountries();

	public List<State> getStatesByCountryId(Integer countryId);

}
