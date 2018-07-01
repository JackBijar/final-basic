package com.spring.boot.hibernate.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name="zip_code")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ZipCode implements Serializable
{
	private static final long serialVersionUID = 7789736082815765568L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Integer id;
	
	@Column(name = "name", unique = true, nullable = false)
	private String name;
	
	//@ManyToOne
    //@JoinColumn(name="city_id", nullable=false)
    //private City city;
}
