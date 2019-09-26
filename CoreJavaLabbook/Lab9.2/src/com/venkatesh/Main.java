package com.venkatesh;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        char[] arr = new char[10];
        Scanner sc = new Scanner(System.in);
        arr = sc.next().toCharArray();

        count(arr);
    }
    public static void count(char[] arr){
        Map<Character,Integer> count = new HashMap<>();
        for(int i =0;i<arr.length;i++){
            if(count.get(Character.valueOf(arr[i]))!=null){
                count.put(Character.valueOf(arr[i]),count.get(Character.valueOf(arr[i]))+1);
            }
            else{
                count.put(Character.valueOf(arr[i]),1);
            }
        }
        for (Map.Entry<Character,Integer> map: count.entrySet()
             ) {
            System.out.println(map.getKey()+" "+map.getValue());
        }
    }
}
