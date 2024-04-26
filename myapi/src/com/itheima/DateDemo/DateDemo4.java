package com.itheima.DateDemo;

import java.util.Calendar;
import java.util.Date;

/**
 * 功能:
 * 作者:
 * 日期:2024/04/24 20:44
 */
public class DateDemo4 {
    public static void main(String[] args) {


        Calendar cal = Calendar.getInstance();

        Date d = new Date(500000000L);

        cal.setTime(d);

        System.out.println(cal);

        cal.set(Calendar.YEAR, 2000);
        cal.set(Calendar.MONTH, 10);


        cal.add(Calendar.MONTH, 1);

        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH)+1;
        int date = cal.get(Calendar.DATE);
        int week = cal.get(Calendar.DAY_OF_WEEK);
        System.out.println(year + ", " +month + " , " + date + ", " + week );
    }

}
