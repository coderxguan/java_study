package com.itheima.function;

/**
 * 功能:
 * 作者:
 * 日期:2024/04/02 22:25
 */
public class arrayDemo2 {
    public static void main(String[] args) {
        int[] arr = {33, 5, 22, 44, 55};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }

        System.out.println("最大值是" + max);

    }
}
