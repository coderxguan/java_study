package com.itheima.test;

import java.util.Scanner;

/**
 * 功能:
 * 作者:
 * 日期:2024/04/01 22:11
 */
public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数");
        int number = sc.nextInt();

        int ge = number %10;
        int shi = number /10%10;
        int bai = number /100 %10;
        System.out.println("个位是" +  ge);
        System.out.println("十位是" + shi);
        System.out.println("百位是" + bai);


    }
}
