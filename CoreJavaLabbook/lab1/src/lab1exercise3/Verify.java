package lab1exercise3;

import java.util.Scanner;

public class Verify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Check c=new Check();
		if(c.check(sc.nextInt())) {
			System.out.println("it is an increasing digit");
		}
		else {
			System.out.println("it is not an increasing digit");
		}

	}

}
