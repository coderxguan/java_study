package com.itheima.LambdaDemo;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 功能:
 * 作者:
 * 日期:2024/04/26 11:48
 */
public class Demo1 {
    public static void main(String[] args) {
        Integer[] arr = {2, 3, 1, 6, 5};

        Arrays.sort(arr,(Integer o1, Integer o2)-> {
                    return o1 - o2;
        });


        System.out.println(Arrays.toString(arr));

    }
}
