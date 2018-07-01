package com.spring.boot.hibernate.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.hibernate.dao.EmployeeDao;
import com.spring.boot.hibernate.model.City;
import com.spring.boot.hibernate.model.Country;
import com.spring.boot.hibernate.model.Employee;
import com.spring.boot.hibernate.model.State;
import com.spring.boot.hibernate.service.EmployeeService;

@RestController
//@RequestMapping(value = "/employees")
public class EmployeeController 
{
	@Autowired
	private EmployeeService employeeService;
	
	@Autowired
	private EmployeeDao employeeDao;
	
	private List<Employee> employeeList;
	
	private Employee employee;
	
	private Country country;
	private List<Country> countryList;
	
	private City city;	
	private List<City> cityList;
	
	private List<State> stateList;
	
	@GetMapping("/employees")
	public List<Employee> getEmployees()
	{
		employeeList = employeeService.getEmployees();
		
		return employeeList;
	}
	
	@PostMapping("/employees")
	public Employee saveEmployee(@RequestBody Employee employee)
	{
		employee = employeeService.saveEmployee(employee);
		
		return employee;
	}
	
	@GetMapping("/country/{countryId}")
	public Country getCountry(@PathVariable Integer countryId)
	{
		country = employeeDao.getCountry(countryId);
		
		return country;
	}
	
	@GetMapping("/countries")
	public List<Country> getCountries()
	{		
		countryList = employeeDao.getCountries();
		
		return countryList;
	}
	
	@GetMapping("/countries/{countryId}/states")
	public List<State> getStatesByCountryId(@PathVariable Integer countryId)
	{		
		System.out.println("countryId =======>>> "+countryId);
		
		stateList = employeeDao.getStatesByCountryId(countryId);
		
		return stateList;
	}
	
	@GetMapping("/city/{cityId}")
	public City getCity(@PathVariable Integer cityId)
	{
		city = employeeDao.getCity(cityId);
		
		return city;
	}
}
