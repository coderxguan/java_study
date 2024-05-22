package com.itheima.threadpool;

/**
 * 功能:
 * 作者:
 * 日期:2024/05/22 19:40
 */
public class ThreadPoolDemo3 {
    public static void main(String[] args) {

        int count = Runtime.getRuntime().availableProcessors();
        System.out.println(count);
    }
}
