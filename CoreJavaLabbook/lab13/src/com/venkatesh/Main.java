package com.venkatesh;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner scanner = new Scanner(System.in);
        Lab13ex1 lt = (int x, int y) -> System.out.println(Math.pow(x,y));
        lt.myFunc(2,3);

        Lab13ex2 ex2=(String str) -> {
            str = str.replaceAll(""," ");
            System.out.println(str);
        };

        ex2.myFunc("hello");

        String userName="venkatesh";
        String password="12345";
        Lab13ex3 ex3 = (String str1,String str2)->{
            if(userName.matches(str1)&&password.matches(str2)){
                System.out.println("logging you in.....");
            }
            else{
                System.out.println("Invalid user name");
            }
        };

       
        ex3.myFunc("venkatesh","12345");


    }
}
