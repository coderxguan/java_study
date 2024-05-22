package com.itheima.threadsafe;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 功能:
 * 作者:
 * 日期:2024/05/20 19:02
 */
public class MyRunnable implements Runnable{
    int ticket = 0;

    static Lock lock = new ReentrantLock();


    @Override
    public void run() {
        // 循环
        // 同步代码块
        // 判断共享数据是否到了末尾


        while (true){
//            synchronized (MyRunnable.class){
            lock.lock();
                if(ticket == 100){
                    break;
                }
                else{
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    ticket++;
                    System.out.println(Thread.currentThread().getName() + "在卖第" + ticket + "张票");
                }

                lock.unlock();
            //}
        }
    }
}
