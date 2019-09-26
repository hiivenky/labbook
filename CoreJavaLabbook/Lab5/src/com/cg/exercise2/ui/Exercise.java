package com.cg.exercise2.ui;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise {
	
	public static int nonrecursiveFibonacci(int n) {
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(1);
		int a=1;
		int b=1;
		int c;
		
		for(int i=2;i<=n-1;i++) {
			c=a+b;
			arr.add(c);
			a=b;
			b=c;
		}
		
		return arr.get(n-1);
		
	}
	
	public static int recursiveFibonacci(int n) {
		
		if(n-1==0||n-1==1) {
			return 1;
		}
		
		return recursiveFibonacci(n-1)+recursiveFibonacci(n-2);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to find the nth fibonacci");
		
		int n=sc.nextInt();
		
		System.out.println("recursive fibonacci value "+recursiveFibonacci(n));
		System.out.println("nonrecursive fibonacci value "+nonrecursiveFibonacci(n));
		
		

	}

}
