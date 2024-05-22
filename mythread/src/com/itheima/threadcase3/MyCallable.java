package com.itheima.threadcase3;

import java.util.concurrent.Callable;

/**
 * 功能:
 * 作者:
 * 日期:2024/05/19 15:27
 */
public class MyCallable implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            sum += i;
        }

        return sum;

    }
}
