package com.itheima.Test;

/**
 * 功能:
 * 作者:
 * 日期:2024/04/06 21:00
 */
public class Test2 {
    public static void main(String[] args) {
        int [] arr = {11, 22, 33, 44, 55};

        printArr(arr);

    }

    // 定义方法用于数组的遍历
    public static void printArr(int [] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if( i == arr.length -1){
                System.out.print(arr[i]);
            }
            else{
                System.out.print(arr[i] +", ");
            }

        }
        System.out.println("]");
    }
}
