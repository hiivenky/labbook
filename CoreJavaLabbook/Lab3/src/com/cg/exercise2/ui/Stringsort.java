package com.cg.exercise2.ui;

import java.util.Arrays;
import java.util.Scanner;

public class Stringsort {
	
	public static String[] check(String str[]) {
		
		int upcase;
		
		if(str.length%2==0) {
			
			upcase=str.length/2;
		}
		else {
			upcase=(str.length/2)+1;
		}
		
		Arrays.sort(str);
		
		for(int i=0;i<str.length;i++) {
			
			if(i<upcase) {
				str[i]=str[i].toUpperCase();
			}
			else {
				str[i]=str[i].toLowerCase();
			}
		}
		
		return str;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter the no of String elements");
		
		
		
		int size=sc.nextInt();
		
		String[] str = new String[size];
		
		sc.nextLine();
		
		System.out.println("Enter the String objects");
		
	
		
		for(int i=0;i<size;i++) {
			
			str[i]=sc.nextLine();
			
		}
		
		str=check(str);
		
		for(int i=0;i<str.length;i++) {
			
			System.out.println(str[i]);
			
		}
		
		sc.close();

	}

}
