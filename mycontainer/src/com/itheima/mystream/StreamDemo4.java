package com.itheima.mystream;

import java.util.Arrays;

/**
 * 功能:
 * 作者:
 * 日期:2024/05/11 21:31
 */
public class StreamDemo4
{
    public static void main(String[] args) {

        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        Arrays.stream(arr). forEach(s-> System.out.println(s));

    }
}
