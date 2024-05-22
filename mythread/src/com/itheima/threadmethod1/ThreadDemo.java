package com.itheima.threadmethod1;

/**
 * 功能:
 * 作者:
 * 日期:2024/05/19 15:53
 */
public class ThreadDemo {
    public static void main(String[] args) {
//        MyThread t1 = new MyThread("飞机");
//        MyThread t2 = new MyThread("坦克");
//
//        t1.start();
//        t2.start();


        Thread t = Thread.currentThread();

        System.out.println(t.getName());


    }
}
