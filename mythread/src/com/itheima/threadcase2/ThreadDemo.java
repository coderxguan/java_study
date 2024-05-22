package com.itheima.threadcase2;

/**
 * 功能:
 * 作者:
 * 日期:2024/05/19 15:02
 */
public class ThreadDemo {
    public static void main(String[] args) {

        MyRun mr = new MyRun();

        Thread t1 = new Thread(mr);
        Thread t2 = new Thread(mr);

        t1.setName("111");
        t2.setName("222");

        t1.start();
        t2.start();


    }
}
