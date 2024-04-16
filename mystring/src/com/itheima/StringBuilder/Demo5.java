package com.itheima.StringBuilder;

import java.util.StringJoiner;

/**
 * 功能:
 * 作者:
 * 日期:2024/04/12 18:03
 */
public class Demo5 {
    public static void main(String[] args) {
        StringJoiner sj = new StringJoiner(", ", "[", "]");

        sj.add("aaa").add("bbb").add("ccc");
        System.out.println(sj);
    }
}
