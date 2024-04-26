package com.itheima.DateDemo;

import java.util.Date;
import java.util.Random;

/**
 * 功能:
 * 作者:
 * 日期:2024/04/24 19:57
 */
public class DateDemo2 {
    public static void main(String[] args) {


        Date d1 = new Date(0L);

        long time = d1.getTime();

        time = time + 1000L*60*60*24*365;

        d1.setTime(time);

        System.out.println(d1);


        Random r = new Random();
        Date d2 = new Date(Math.abs(r.nextInt()));
        Date d3 = new Date(Math.abs(r.nextInt()));

        if(d2.getTime() > d3.getTime()){
            System.out.println("d2 is bigger than d3");
            System.out.println(d2);
            System.out.println(d3);
        }
    }
}
