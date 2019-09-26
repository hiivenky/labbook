package com.cg.exercise4.ui;

import java.util.Scanner;

public class CharCount {
	
	public static void check(char[] ch) {
		
		int max=(int)ch[0];
		
		for(int i=1;i<ch.length;i++) {
			if((int)max<(int)ch[i]) {
				max=(int)ch[i];
			}
		}
		//System.out.println(max);
		int[] arr = new int[max+1];
		for(int i=0;i<=max;i++) {
			arr[i]=0;
		}
		for(int i=0;i<ch.length;i++) {
			arr[(int)ch[i]]=arr[(int)ch[i]]+1;
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				System.out.println("no of elements of "+(char)(arr[i])+" "+arr[i]);
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String");
		
		String str=sc.nextLine();
		
		check(str.toCharArray());

	}

}
