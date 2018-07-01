package com.spring.boot.hibernate.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.boot.hibernate.model.City;
import com.spring.boot.hibernate.model.Country;
import com.spring.boot.hibernate.model.Employee;
import com.spring.boot.hibernate.model.State;
import com.spring.boot.hibernate.repository.CountryRepository;
import com.spring.boot.hibernate.repository.EmployeeRepository;

@Transactional
@Repository
public class EmployeeDaoImpl implements EmployeeDao 
{
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private CountryRepository countryRepository;
	
	@PersistenceContext	
	private EntityManager entityManager;
	
	private List<Country> countryList;
	
	@Override
	public List<Employee> getEmployees()
	{		
		return (List<Employee>) employeeRepository.findAll();
	}

	@Override
	public Employee saveEmployee(Employee employee) 
	{		
		return employeeRepository.save(employee);
	}

	@Override
	public Country getCountry(Integer countryId) 
	{
		return entityManager.find(Country.class, 2);
	}
	
	@Override
	public City getCity(Integer cityId)
	{		
		return entityManager.find(City.class, cityId);
	}

	@Override
	public List<Country> getCountries() 
	{		
		countryList = (List<Country>) countryRepository.findAll();
		
		for(Country country : countryList)
		{
			System.out.println("country : "+country.toString());
		}
		
		return countryList;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<State> getStatesByCountryId(Integer countryId) 
	{
		String nativeQuery = "Select s.id, s.name, s.country_id from state s where s.country_id = ?";	
		
		Query query = entityManager.createNativeQuery(nativeQuery, State.class);
		
			query.setParameter(1, countryId);
			
		return (List<State>) query.getResultList();
						
	}	

}
