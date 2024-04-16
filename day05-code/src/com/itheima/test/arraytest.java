package com.itheima.test;

import java.util.Random;

/**
 * 功能:
 * 作者:
 * 日期:2024/04/02 22:39
 */
public class arraytest {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random r = new Random();
        int sum = 0;

        for (int i = 0; i < 10; i++) {
            arr[i] = r.nextInt(100) + 1;
            sum +=arr[i];
        }

        double avg = sum / 10.0;
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < avg) {
                count++;
            }

        }

        System.out.println("所有随机数的和为" + sum);
        System.out.println("所有随机数的平均数为" + avg);
        System.out.println("有" + count + "个数据比平均数小");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }


    }
}
