package com.itheima.test;

/**
 * 功能:
 * 作者:
 * 日期:2024/04/02 23:14
 */
public class memory {
    public static void main(String[] args) {
        int [] arr1 = {11, 22};
        int [] arr2 = arr1;

        System.out.println(arr1[0]);
        System.out.println(arr2[0]);

        arr2[0] = 33;
        System.out.println(arr1[0]);
        System.out.println(arr2[0]);

    }
}
