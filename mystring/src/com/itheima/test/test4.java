package com.itheima.test;

import java.util.Scanner;

/**
 * 功能:
 * 作者:
 * 日期:2024/04/11 20:54
 */
public class test4 {
    public static void main(String[] args) {
        String rightUsername = "zhansan";
        String rightPassword = "123456";

        for (int i = 0; i < 3; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入用户名");
            String username = sc.next();
            System.out.println("请输入密码");
            String password = sc.next();

            if(username.equals(rightUsername) && password.equals(rightPassword)){
                System.out.println("用户登录成功");
                break;
            }else{
                System.out.println("用户名或密码错误,你还剩下"+(2-i) +"次机会");
        }
        }
    }
}
