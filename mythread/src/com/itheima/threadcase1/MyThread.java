package com.itheima.threadcase1;

/**
 * 功能:
 * 作者:
 * 日期:2024/05/19 14:56
 */
public class MyThread extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + "helloWorld");
        }
    }

}
