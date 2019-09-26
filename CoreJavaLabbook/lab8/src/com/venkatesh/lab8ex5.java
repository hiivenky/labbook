package com.venkatesh;

import java.util.Scanner;

public class lab8ex5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int i=0;
        boolean flag =true;
        while((str.charAt(i)>str.charAt(i+1))&&i<str.length()-2){
            flag=false;
            break;
        }
        if(flag){
            System.out.println("positive string");
        }
        else{
            System.out.println("negative string");
        }
    }
}
