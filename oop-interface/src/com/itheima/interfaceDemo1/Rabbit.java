package com.itheima.interfaceDemo1;

/**
 * 功能:
 * 作者:
 * 日期:2024/04/17 20:04
 */
public class Rabbit extends Animal{

    public Rabbit() {
    }

    public Rabbit(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("兔子再吃胡萝卜");
    }
}
