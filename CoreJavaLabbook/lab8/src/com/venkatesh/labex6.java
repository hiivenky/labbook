package com.venkatesh;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class labex6 {

    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");

        try {
            Date d= sdf.parse("2019/11/11");

        } catch (ParseException e) {
            e.printStackTrace();
        }


    }
}
