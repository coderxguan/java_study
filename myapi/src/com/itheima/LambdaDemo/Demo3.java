package com.itheima.LambdaDemo;

import java.util.Arrays;

/**
 * 功能:
 * 作者:
 * 日期:2024/04/26 12:40
 */
public class Demo3 {
    public static void main(String[] args) {
        Integer[] arr = {2, 3, 1, 6, 5};
        // 完整格式
//        Arrays.sort(arr,(Integer o1, Integer o2)-> {
//            return o1 - o2;
//        });

        // 省略格式
        Arrays.sort(arr,(o1, o2)-> o2 - o1);

        System.out.println(Arrays.toString(arr));


    }
}
