package com.itheima.threadcase3;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 功能:
 * 作者:
 * 日期:2024/05/19 15:07
 */
public class ThreadDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        MyCallable mc  = new MyCallable();

        FutureTask<Integer> ft = new FutureTask<>(mc);

        Thread t1 = new Thread(ft);

        t1.start();

        Integer result = ft.get();
        System.out.println( result);


    }
}
