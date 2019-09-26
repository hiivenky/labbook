package lab1exercise4;

import java.util.Scanner;

public class Check {
	
	public static void check(int n) {
		
		
		double val=Math.log(n)/Math.log(2);
		
		if(Math.ceil(val)!=Math.floor(val)){
			System.out.println("It is not a power of 2");
		}
		else {
			System.out.println("It is a power of 2");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		check(sc.nextInt());

	}

}
