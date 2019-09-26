package com.cg.exercise5.dto;

public class Employee extends Exception {
	
	private int age;

	public Employee(int age) throws Exception {
		if(age<=15) {
			throw new Exception("Age must be greater than 15");
		}
		this.age = age;
	}

	public Employee(String arg0,int age) {
		super(arg0);
		this.age=age;
		// TODO Auto-generated constructor stub
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
	

}
