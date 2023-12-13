package com.sprint1.Entity;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="student_boot")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="stud_id")
	
	private int id;
	@Column(name="name", length=50)
	private String name;
	@Column(name="address", length=50)
	private String address;
	@Column(name="phone", length=10, unique=true)
	private String phone;

	
	public Student() {
	    // Empty constructor needed by JPA
	}
	
	public Student(int id, String name, String address, String phone) {
		super();
		this.id=id;
		this.name = name;
		this.address = address;
		this.phone = phone;
		
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	
	
}
