package com.cg.eis.ui;

import java.util.Scanner;

import com.cg.eis.exception.EmployeeException;

public class Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the name of the employee");
		String name=sc.nextLine();
		
		System.out.println("Enter the salary of the employee");
		Double salary=sc.nextDouble();
		
		try {
			EmployeeException emp = new EmployeeException(name,salary);
			System.out.println(emp);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		

	}

}
