package com.itheima.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.SimpleTimeZone;

/**
 * 功能:
 * 作者:
 * 日期:2024/04/25 15:08
 */
public class Test4 {
    public static void main(String[] args) throws ParseException {

        String birthday = "2004-1-1";

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(birthday);
        long birthdayTime = date.getTime();

        long todayTime = System.currentTimeMillis();


        long time = todayTime - birthdayTime;

        System.out.println(time / 1000/ 60 /60 / 24);


        LocalDate ld1 = LocalDate.of(2000, 1, 1);
        LocalDate ld2 = LocalDate.now();


        long days = ChronoUnit.DAYS.between(ld1, ld2);
        System.out.println(days);


    }
}
