package com.itheima.threadmethod1;

/**
 * 功能:
 * 作者:
 * 日期:2024/05/19 15:53
 */
public class MyThread extends Thread{
    public MyThread() {
    }
    public MyThread(String name){
        super(name);
    }

    @Override
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + "@" + i);
        }
    }

}
