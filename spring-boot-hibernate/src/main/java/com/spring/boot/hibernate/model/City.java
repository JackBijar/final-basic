package com.spring.boot.hibernate.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name="city")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class City implements Serializable
{
	private static final long serialVersionUID = -2983519315616761480L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Integer id;
	
	@Column(name = "name", unique = true, nullable = false)
	private String name;
	
	//@ManyToOne
    //@JoinColumn(name="state_id", nullable=false)
    //private State state;
	
	//@OneToMany(mappedBy="city")
    //private Set<ZipCode> zipCodes;
}
