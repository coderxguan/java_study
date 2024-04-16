package com.itheima.infiniteloop;

/**
 * 功能:
 * 作者:
 * 日期:2024/04/02 21:55
 */
public class InfiniteloopDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if(i==3) {
                System.out.println("第四个个包子有虫子");
                continue;
            }
            System.out.println("小老虎再吃第" + (i+1) + "个包子");
        }
    }
}
