package com.venkatesh;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner scanner = new Scanner(System.in);
        String token = scanner.nextLine();

        StringTokenizer tokenizer = new StringTokenizer(token," ");

        int sum=0;
        while(tokenizer.hasMoreElements()){
            Integer value = Integer.parseInt(tokenizer.nextToken());
            sum=sum+value;
        }
        System.out.println(sum);
    }
}
