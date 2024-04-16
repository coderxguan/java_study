package com.itheima.Test;

/**
 * 功能:
 * 作者:
 * 日期:2024/04/06 21:07
 */
public class Test3 {
    public static void main(String[] args) {
        int[] arr = {
                1, 2, 3, 4, 5, 6, 9
        };
        int max = getMax(arr);

        System.out.println(max);


    }

    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        return max;
    }
}
