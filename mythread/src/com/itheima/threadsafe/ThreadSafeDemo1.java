package com.itheima.threadsafe;

/**
 * 功能:
 * 作者:
 * 日期:2024/05/20 19:00
 */
public class ThreadSafeDemo1 {
    public static void main(String[] args) {
        MyRunnable mr = new MyRunnable();

        Thread t1 = new Thread(mr);
        Thread t2 = new Thread(mr);
        Thread t3 = new Thread(mr);
        t1.setName("111");
        t2.setName("222");
        t3.setName("333");

        t1.start();
        t2.start();
        t3.start();

    }

}
