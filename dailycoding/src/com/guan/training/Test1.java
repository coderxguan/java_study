package com.guan.training;

import java.util.Scanner;
import java.util.StringJoiner;

/**
 * 功能:
 * 作者:
 * 日期:2024/04/28 11:19
 */
public class Test1 {
    public static void main(String[] args) {
        Date d = new Date();
        Scanner sc = new Scanner(System.in);

        d.Set(sc.next());
        d.Print();
    }
}

class Date{
    private String year;
    private String month;
    private String day;
    public void Set(String s){
        String[] t = s.split("-");
        year = t[0];
        month = t[1];
        day = t[2];
    }
    public void Print(){
        System.out.printf("%s:%s:%s", year, month, day);
    }
}
