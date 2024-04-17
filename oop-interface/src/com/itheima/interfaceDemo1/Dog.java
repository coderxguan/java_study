package com.itheima.interfaceDemo1;

/**
 * 功能:
 * 作者:
 * 日期:2024/04/17 20:07
 */
public class Dog extends Animal implements Swim{
    @Override
    public void eat() {
        System.out.println("狗在吃骨头");
    }

    @Override
    public void swim() {
        System.out.println("狗刨");
    }
}
