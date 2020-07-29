package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GeneratorType;

import lombok.Data;

@Data
@Entity(name="STUDENT")
public class Student {
	@Column(name="NAME")
	String name;
	@Column(name="ADDRESS")
	String address;
	@Column(name="ROLL_NO")
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	Integer rollNo;

}
