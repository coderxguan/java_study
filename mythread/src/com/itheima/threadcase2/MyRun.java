package com.itheima.threadcase2;

/**
 * 功能:
 * 作者:
 * 日期:2024/05/19 15:02
 */
public class MyRun implements Runnable{
    @Override
    public void run() {
        Thread t = Thread.currentThread();
        for (int i = 0; i < 100; i++) {
            System.out.println(t.getName() +  " hello");
        }
    }
}
