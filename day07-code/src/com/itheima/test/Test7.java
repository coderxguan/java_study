package com.itheima.test;

import java.util.Random;

/**
 * 功能:
 * 作者:
 * 日期:2024/04/07 16:08
 */
public class Test7 {
    public static void main(String[] args) {
        int [] arr = {2, 588, 888, 1000, 10000};

        int [] newArr = new int[arr.length];
        Random r = new Random();

        for (int i = 0; i < 5;) {
            int randomIndex = r.nextInt(arr.length);

            int prize = arr[randomIndex];

            if(!contains(newArr, prize)){
                newArr[i] = prize;
                i++;
            }
        }

        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }


    public static boolean contains(int [] arr , int prize){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == prize){
                return true;
            }
        }
        return false;
    }
}
