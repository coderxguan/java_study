package com.itheima.interfaceDemo1;

/**
 * 功能:
 * 作者:
 * 日期:2024/04/17 20:08
 */
public class Test {
    public static void main(String[] args) {
        Frog f = new Frog("小青", 1);
        System.out.println(f.toString());

        f.eat();
        f.swim();
    }
}
