package com.itheima.threadcase1;

/**
 * 功能:
 * 作者:
 * 日期:2024/05/19 14:56
 */
public class ThreadDemo1 {
    public static void main(String[] args) {

        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.setName("线程1");
        t2.setName("线程2");

        t1.start();
        t2.start();




    }
}
