package com.venkatesh;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class lab8ex3 {

    public static void main(String[] args) {
        int charecters = 0;
        int words = 0;
        int lines = 0;

        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Lenovo\\Desktop\\sample.txt"));

            String str  ;
            while((str=br.readLine())!=null){
               lines = lines+1;
               words = words +str.split(" ").length;
               charecters = str.length();
            }

            System.out.println("charecters "+charecters+" words "+words+" lines "+lines);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

