package com.itheima.staticDemo2;

/**
 * 功能:
 * 作者:
 * 日期:2024/04/14 21:05
 */
public class TestDemo {
    public static void main(String[] args) {
        int [] arr1 = {1, 2, 3, 4, 5, 6};
        String str = ArrayUtil.printArr(arr1);
        System.out.println(str);


        double [] arr2= {1.4, 2.4, 5.2, 3.6, 12.4};
        double avg = ArrayUtil.getAverage(arr2);
        System.out.println(avg);
    }
}
