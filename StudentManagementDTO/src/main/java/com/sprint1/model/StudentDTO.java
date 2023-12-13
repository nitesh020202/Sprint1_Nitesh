package com.sprint1.model;

//import javax.validation.constraints.Size;

import jakarta.annotation.Nonnull;

//import javax.validation.constraints.NotNull;



public class StudentDTO {
	@Nonnull
	private int id;
	@Nonnull
	@jakarta.validation.constraints.Size(min=3,max=50, message="Name should be within 3 to 50 charecters")
	private String name;
	@Nonnull
	@jakarta.validation.constraints.Size(min=10,max=100, message="Address should be within 10 to 100 charecters")
	private String address;
	@Nonnull
	@jakarta.validation.constraints.Size(min=10,max=10, message="phone should contain 10 digits")
	private String phone;
	
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
