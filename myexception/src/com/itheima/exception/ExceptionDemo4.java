package com.itheima.exception;

/**
 * 功能:
 * 作者:
 * 日期:2024/05/13 11:04
 */
public class ExceptionDemo4 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        try {
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("索引越界了");
        }
        System.out.println("hello");
    }
}
