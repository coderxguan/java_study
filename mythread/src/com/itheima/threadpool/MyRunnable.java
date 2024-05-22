package com.itheima.threadpool;

/**
 * 功能:
 * 作者:
 * 日期:2024/05/22 18:53
 */
public class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(Thread.currentThread().getName() + "-----" + i);
        }
    }
}
