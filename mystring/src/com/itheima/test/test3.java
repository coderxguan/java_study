package com.itheima.test;

import java.util.Scanner;

/**
 * 功能:
 * 作者:
 * 日期:2024/04/11 20:38
 */
public class test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str1 = sc.next();
        String str2 = "abc";
        System.out.println(str1 == str2);
    }
}
