package com.itheima.function;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 功能:
 * 作者:
 * 日期:2024/05/12 11:26
 */
public class FunctionDemo1 {
    public static void main(String[] args) {
        Integer[] arr = {3, 5, 4, 1, 6};

        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2- o1;
            }
        });

        Arrays.sort(arr, ( o1,  o2)->o2- o1);


        Arrays.sort(arr, FunctionDemo1::subtraction);


        System.out.println(Arrays.toString(arr));
    }



    public static int subtraction(int num1, int num2){
        return num2 - num1;
    }
}
