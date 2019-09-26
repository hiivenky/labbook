package com.cd.exercise1.ui;

import java.util.Scanner;

public class CubicSum {
	
	public static void sum(long n) {
		int csum=0,rem;
		while(n>0) {
			rem=(int)n%10;
			csum=csum+(rem*rem*rem);
			n=n/10;
			
		}
		System.out.println("Cubic sum is: "+csum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		
		long num=sc.nextLong();
		
		sum(num);
		

	}

}
