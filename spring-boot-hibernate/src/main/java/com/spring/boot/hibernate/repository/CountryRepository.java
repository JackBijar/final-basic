package com.spring.boot.hibernate.repository;

import org.springframework.data.repository.CrudRepository;

import com.spring.boot.hibernate.model.Country;

public interface CountryRepository extends CrudRepository<Country, Integer>
{

}
