package com.venkatesh;

import java.io.*;

public class lab8ex2 {

    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Lenovo\\Desktop\\sample.txt"));
            int count=1;
            String str = null;
            while((str=br.readLine())!=null){
                str=count+" "+str;
                System.out.println(str);
                count=count+1;
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
