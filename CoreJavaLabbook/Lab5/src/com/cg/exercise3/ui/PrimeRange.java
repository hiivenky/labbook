package com.cg.exercise3.ui;

import java.util.Scanner;

public class PrimeRange {
	
	public static boolean primeNumber(int n) {
		for(int i=2;i<=(n/2);i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	
	public static void primerange(int n) {
		for(int i=2;i<n;i++) {
			if(primeNumber(i)) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to find th prime numbers till that number");
		
	int n=sc.nextInt();
	
	primerange(n);

	}

}
