package com.cg.exercise1.ui;

import java.util.Scanner;

public class TrafficLight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the traffic signal");
		String signal=sc.next();
		
		if(signal.toLowerCase().equals("red")) {
			System.out.println("Stop");
		}
		else if(signal.toLowerCase().equals("yellow")) {
			System.out.println("Ready");
		}
		else if(signal.toLowerCase().equals("green")) {
			System.out.println("Go");
		}
		else {
			System.out.println("There is no signal of type "+signal);
		}
		

	}

}
