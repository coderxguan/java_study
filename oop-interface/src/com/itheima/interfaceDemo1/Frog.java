package com.itheima.interfaceDemo1;

/**
 * 功能:
 * 作者:
 * 日期:2024/04/17 20:06
 */
public class Frog extends Animal implements Swim{
    @Override
    public void eat() {
        System.out.println("青蛙在吃虫子");
    }

    public Frog() {
    }

    public Frog(String name, int age) {
        super(name, age);
    }

    @Override
    public void swim() {
        System.out.println("青蛙在蛙泳");
    }
}
