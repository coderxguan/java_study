package com.itheima.function;

/**
 * 功能:
 * 作者:
 * 日期:2024/04/06 19:34
 */
public class MethodDemo3 {
    public static void main(String[] args) {
        System.out.println("a");
        method1();
        System.out.println("b");

    }

    public static void method1(){
        method2();
        System.out.println("c");
    }

    public static void method2(){
        System.out.println("d");
        System.out.println("e");
    }
}
