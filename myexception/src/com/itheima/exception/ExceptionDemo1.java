package com.itheima.exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 功能:
 * 作者:
 * 日期:2024/05/13 10:42
 */
public class ExceptionDemo1 {
    public static void main(String[] args) throws ParseException {
        String time = "2020年1月1日";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        Date date = sdf.parse(time);
        System.out.println(date);


    }
}
