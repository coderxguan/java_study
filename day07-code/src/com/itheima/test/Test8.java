package com.itheima.test;

import java.util.Random;

/**
 * 功能:
 * 作者:
 * 日期:2024/04/07 16:15
 */
public class Test8 {
    public static void main(String[] args) {
        int [] arr = {2, 588, 888, 1000, 10000};

        Random r= new Random();
        for (int i = 0; i < arr.length; i++) {
            int randomIndex = r.nextInt(arr.length);
            int tmp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = tmp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
