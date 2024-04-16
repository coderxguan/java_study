package com.itheima.test;

/**
 * 功能:
 * 作者:
 * 日期:2024/04/07 11:05
 */
public class Test2 {
    public static void main(String[] args) {

        int count = 0;
        count = getCount(count);
        System.out.println("一共有" + count + "个质数");





    }

    private static int getCount(int count) {
        for (int i = 101; i < 200; i++) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if(i % j == 0){
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.println("当前数字是" + i + "质数");
                count++;
            }
            else{
//                System.out.println("当前数字 " + i + "不是质数");
            }

        }
        return count;
    }
}
