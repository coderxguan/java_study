package com.itheima.innerDemo3;

/**
 * 功能:
 * 作者:
 * 日期:2024/04/18 15:13
 */
public class Outer {
    int a = 10;
    static int b = 20;


    static class Inner{

        public void show1(){

            System.out.println("非静态的方法被调用了");
        }
        public static void show2(){

            System.out.println("静态的方法被调用了");
        }
    }
}
