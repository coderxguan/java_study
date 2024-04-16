package com.itheima.StringBuilder;

/**
 * 功能:
 * 作者:
 * 日期:2024/04/12 16:44
 */

public class Demo1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abc");

        sb.append(1);
        sb.append(12.4);
        sb.append(true);



        System.out.println(sb);
    }
}
