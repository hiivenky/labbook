package com.venkatesh;

import java.util.Scanner;

public class lab8ex7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        if(str.matches("[a-zA-Z]{8}_job")){
            System.out.println("validation passed");
        }
        else{
            System.out.println("validation failed");
        }
    }
}
