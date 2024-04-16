package com.itheima.test;

/**
 * 功能:
 * 作者:
 * 日期:2024/04/08 22:32
 */
public class PhoneTest {
    public static void main(String[] args) {
        Phone p = new Phone();

        p.brand = "小米";
        p.price = 1999.98;

        System.out.println(p.brand);
        System.out.println(p.price);

        p.call();
        p.playGame();
    }
}
