package com.itheima.exception;

/**
 * 功能:
 * 作者:
 * 日期:2024/05/13 10:51
 */
public class ExceptionDemo2 {
    public static void main(String[] args) {

        Student1[] arr = new Student1[3];  //null null null
        String name = arr[0].getName();
        System.out.println(name);
    }
}
