package com.itheima.search;

/**
 * 功能:
 * 作者:
 * 日期:2024/04/25 19:04
 */
public class SearchDemo1 {
    public static void main(String[] args) {
        int [] arr = {132, 4234,6554,253,245};
        int number = 245;
        System.out.println(basicSearch(arr, number));
    }


    public static boolean basicSearch(int [] arr, int number){
        for (int i : arr) {
            if(i == number){
                return true;
            }
        }
        return false;
    }
}
