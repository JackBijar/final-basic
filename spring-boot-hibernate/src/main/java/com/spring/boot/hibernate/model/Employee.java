package com.spring.boot.hibernate.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="employee")
public class Employee implements Serializable
{
	private static final long serialVersionUID = 5510367586718904546L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)	    
	private Long id;
	
	@Embedded
	private Name name;	
	
	@Embedded
	private Address address;
	
	@Column(name = "salary")
	private Double salary;
	
	@Column(name = "deg")
	private String deg;
}
