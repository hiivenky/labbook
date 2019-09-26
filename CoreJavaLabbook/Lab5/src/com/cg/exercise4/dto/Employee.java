package com.cg.exercise4.dto;

public class Employee extends Exception {
	
	String firstName;
	String lastName;
	
	public Employee(String firstName,String lastName) throws Exception {
		if(firstName==null||firstName.trim().equals("")) {
			throw new Exception("First name should not be null");
		}
		if(lastName==null||lastName.trim().equals("")) {
			throw new Exception("Last name should not be null");
		}
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Employee(String msg,String firstName,String lastName) throws Exception {
		super(msg);
		if(firstName==null||firstName.trim().equals("")) {
			throw new Exception("First name should not be null");
		}
		if(lastName==null||lastName.trim().equals("")) {
			throw new Exception("Last name should not be null");
		}
		
		this.firstName = firstName;
		this.lastName = lastName;
		// TODO Auto-generated constructor stub
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
}
