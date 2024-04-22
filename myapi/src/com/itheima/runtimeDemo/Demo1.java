package com.itheima.runtimeDemo;

import java.io.IOException;

/**
 * 功能:
 * 作者:
 * 日期:2024/04/22 14:48
 */
public class Demo1 {
    public static void main(String[] args) throws IOException {
        Runtime r = Runtime.getRuntime();

        System.out.println(r.availableProcessors());

        System.out.println(r.maxMemory()/(1024*1024));

        r.getRuntime().exec("notepad");
    }
}
