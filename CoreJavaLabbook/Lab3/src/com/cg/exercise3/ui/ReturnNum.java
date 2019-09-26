package com.cg.exercise3.ui;

import java.util.Arrays;
import java.util.Scanner;

public class ReturnNum {
	
	public static int[] check(int[] arr) {
		
		Arrays.sort(arr);
		
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter the no of elements");
		
		int[] arr = new int[sc.nextInt()];
		
		System.out.println("Enter the integer elements");
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		arr=check(arr);
		
		System.out.println("Elements in sorted order");
		
		for(int i=0;i<arr.length;i++) {
			
			System.out.println(arr[i]);
		}

	}

}
