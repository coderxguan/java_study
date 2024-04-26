package com.itheima.LambdaDemo;

import java.util.Arrays;

/**
 * 功能:
 * 作者:
 * 日期:2024/04/26 12:46
 */
public class Demo4 {
    public static void main(String[] args) {
        String [] arr= {"a", "aaaa", "aaa", "aa"};

        Arrays.sort(arr, (s1, s2)->s1.length()-s2.length());

        System.out.println(Arrays.toString(arr));
    }
}
