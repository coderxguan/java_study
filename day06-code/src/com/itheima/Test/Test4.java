package com.itheima.Test;

/**
 * 功能:
 * 作者:
 * 日期:2024/04/06 21:11
 */
public class Test4 {
    public static void main(String[] args) {
        int [] arr ={1, 3, 45, 324, 24, 64 , 35};
        boolean contains = contains(arr, 244);
        System.out.println(contains);


    }

    public static boolean contains(int[] arr, int key){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == key) {
                return true;
            }
        }
        return false;
    }
}
