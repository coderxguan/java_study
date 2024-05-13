package com.itheima.exception;

/**
 * 功能:
 * 作者:
 * 日期:2024/05/13 12:09
 */
public class ExceptionDemo5 {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3 ,4, 5, 6};

        try {
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }


    }
}
