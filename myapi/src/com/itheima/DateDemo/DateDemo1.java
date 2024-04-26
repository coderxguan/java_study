package com.itheima.DateDemo;

import java.util.Date;

/**
 * 功能:
 * 作者:
 * 日期:2024/04/24 19:52
 */
public class DateDemo1 {
    public static void main(String[] args) {


        Date d = new Date();
        System.out.println(d);


        Date d2 = new Date(6000);
        System.out.println(d2);

        long time = d2.getTime();
        System.out.println(time);

    }
}
