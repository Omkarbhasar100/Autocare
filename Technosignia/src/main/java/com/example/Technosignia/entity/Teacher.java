package com.example.Technosignia.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Teacher {

	@Id
	Long id;
	
	String name;
	
	String address;
	
	String contact;
}
