package com.cg.smallest.ui;

import java.util.Arrays;
import java.util.Scanner;

public class Check {
	
	public static int check(int[] arr) {
		
		Arrays.sort(arr);
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[0]!=arr[i]) {
				return arr[i];
			}
		}
		
		return -1;
	}
	
	public static void main(String args[]) {
		
		System.out.println("Enter the array size");
		Scanner sc = new Scanner(System.in);
		
		int[] arr =new int[sc.nextInt()];
		
		System.out.println("Enter the array elements");
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		int ret=check(arr);
		
		if(ret==-1) {
			System.out.println("All the elements are sam");
		}
		else {
			System.out.println("The smallest element is"+ret);
		}
		
		sc.close();
	}
	
	

}
