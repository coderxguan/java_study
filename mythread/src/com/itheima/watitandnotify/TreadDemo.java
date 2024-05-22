package com.itheima.watitandnotify;

/**
 * 功能:
 * 作者:
 * 日期:2024/05/20 19:56
 */
public class TreadDemo {
    public static void main(String[] args) {


        Cook c = new Cook();
        Foodie f = new Foodie();

        c.setName("厨子");
        f.setName("吃货");

        c.start();
        f.start();
    }
}
