package com.itheima.threadmethod2;

/**
 * 功能:
 * 作者:
 * 日期:2024/05/19 16:04
 */
public class MyRunnable  implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "----" + i);
        }
    }
}
