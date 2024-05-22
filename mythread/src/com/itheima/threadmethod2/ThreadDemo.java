package com.itheima.threadmethod2;

import com.itheima.threadmethod2.MyRunnable;

/**
 * 功能:
 * 作者:
 * 日期:2024/05/19 16:05
 */
public class ThreadDemo {
    public static void main(String[] args) {

        MyRunnable mr = new MyRunnable();

        Thread t1 =new Thread(mr, "fly");
        Thread t2 =new Thread(mr, "tank");

        t1.setDaemon(true);
        System.out.println(t1.getPriority());
    }
}
