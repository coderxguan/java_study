package com.itheima.test;

/**
 * 功能:
 * 作者:
 * 日期:2024/04/07 15:50
 */
public class Test5 {
    public static void main(String[] args) {
        // 每个数加上5
        // 再对10取余
        // 最后将所有数字翻转

        int[] arr = {1, 9, 8, 3};

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] + 5)%10;
        }

        for (int i = 0, j = arr.length -1; i < j; i++, j--) {
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;

        }
        int result= 0;
        for (int i = 0; i < arr.length; i++) {
            result = (result * 10) + arr[i];
        }

        System.out.println(result);


    }
}
