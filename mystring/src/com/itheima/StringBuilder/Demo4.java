package com.itheima.StringBuilder;

import java.util.StringJoiner;

/**
 * 功能:
 * 作者:
 * 日期:2024/04/12 17:59
 */
public class Demo4 {
    public static void main(String[] args) {
        StringJoiner sj = new StringJoiner("---");

        sj.add("aaa").add("bbb").add("ccc");

        System.out.println(sj);
    }
}
