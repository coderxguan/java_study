package com.itheima.test;

import java.util.Scanner;

/**
 * 功能:
 * 作者:
 * 日期:2024/04/02 22:00
 */
public class looptest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int number = sc.nextInt();

        boolean flag = true;

        for (int i = 2; i < number; i++) {
            if(number % i == 0){
//                System.out.println(number + "不是一个质数");
                flag =false;
                break;
            }
        }

        if(flag){
            System.out.println(number + "是一个质数");
        }
        else
        {
            System.out.println(number +"不是一个质数");
        }

    }
}
