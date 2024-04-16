package com.itheima.StringBuilder;

/**
 * 功能:
 * 作者:
 * 日期:2024/04/12 16:49
 */
public class Demo2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("aaa");
        sb.append("bbb");
        sb.append("ccc");
        sb.append("ddd");

        System.out.println(sb);

        System.out.println(sb.toString());
    }
}
