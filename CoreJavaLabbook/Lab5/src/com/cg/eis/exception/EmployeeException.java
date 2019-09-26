package com.cg.eis.exception;

public class EmployeeException extends Exception {
	
	private String name;
	private Double salary;
	
	public EmployeeException(String name, Double salary) throws Exception {
		this.name = name;
		if(salary.compareTo(3000.00)<0) {
			throw new Exception("salary must be greater than 3000");
		}
		this.salary=salary;
	}
	@Override
	public String toString() {
		return "EmployeeException [name=" + name + ", salary=" + salary + "]";
	}
	public EmployeeException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	
	

}
