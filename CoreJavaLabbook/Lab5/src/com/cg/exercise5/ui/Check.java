package com.cg.exercise5.ui;

import java.util.Scanner;

import com.cg.exercise5.dto.Employee;

public class Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the age");
		
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		
		try {
			Employee emp = new Employee(age);
			System.out.println("The employee age is "+emp.getAge());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		

	}

}
