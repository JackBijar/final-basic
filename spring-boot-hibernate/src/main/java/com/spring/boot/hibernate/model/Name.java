package com.spring.boot.hibernate.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class Name 
{
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "middel_name")
	private String middelName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "full_name")
	private String fullName;
}
