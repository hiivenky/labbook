package com.cg.exercise4.ui;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.cg.exercise4.dto.Employee;

public class Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the firstname");
		String firstName=sc.nextLine();
		System.out.println("Enter the lastname");
		String lastName=sc.nextLine();
		
		Employee emp;
		try {
			emp = new Employee(firstName,lastName);
			System.out.println("firstName "+emp.getFirstName()+" lastName "+lastName);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		Integer x=10;
		List<Integer> i = new ArrayList<Integer>();
		
	//	Collections.sort(i, com);
		
		
		
		
		

	}
	
	
	
	
	

}
