package com.itheima.Test;

/**
 * 功能:
 * 作者:
 * 日期:2024/04/25 14:52
 */
public class Test2
{
    public static void main(String[] args) {
        String str = "1234567";
        // validate str
        // filter exception data
        if(!str.matches("[1-9]\\d{0,9}")){
            // exception
            System.out.println("data format error");
        }else{
            System.out.println("data format right");

            int number = 0;
            for (int i = 0; i < str.length(); i++) {
                int c = str.charAt(i)- '0';
                number = number*10 + c;
            }

            System.out.println(number);
        }



    }
}
