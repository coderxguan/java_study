package com.itheima.function;

/**
 * 功能:
 * 作者:
 * 日期:2024/04/06 19:42
 */
public class MethodDemo4 {
    public static void main(String[] args) {
    int sum = getSum(10, 20);
        System.out.println(sum);

    }

    public static int getSum(int num1, int num2){
        int result = num1 + num2;

        return result;
    }
}