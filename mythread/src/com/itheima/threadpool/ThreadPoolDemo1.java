package com.itheima.threadpool;

import java.lang.reflect.Executable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 功能:
 * 作者:
 * 日期:2024/05/22 18:52
 */
public class ThreadPoolDemo1 {
    public static void main(String[] args) throws InterruptedException {


        ExecutorService pool1 = Executors.newFixedThreadPool(3);

//        Thread.sleep(1000);

        pool1.submit(new MyRunnable());
//        Thread.sleep(1000);
        pool1.submit(new MyRunnable());
//        Thread.sleep(1000);
        pool1.submit(new MyRunnable());
//        Thread.sleep(1000);
        pool1.submit(new MyRunnable());
//        Thread.sleep(1000);
        pool1.submit(new MyRunnable());


//        pool1.shutdown();
    }
}
