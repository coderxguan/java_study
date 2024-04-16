package com.itheima.test;

import java.util.Scanner;

/**
 * 功能:
 * 作者:
 * 日期:2024/04/12 17:15
 */
public class test7 {
    public static void main(String[] args) {
        //  键盘录入一个字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();

        String result = new StringBuilder().append(str).reverse().toString();
        System.out.println(result);

        if(str.equals(result)){
            System.out.println("回文字符串");

        }else{
            System.out.println("no");
        }

    }
}
