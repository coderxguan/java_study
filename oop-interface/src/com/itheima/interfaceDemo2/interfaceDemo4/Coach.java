package com.itheima.interfaceDemo2.interfaceDemo4;

/**
 * 功能:
 * 作者:
 * 日期:2024/04/17 20:50
 */
public abstract class Coach extends Person{
    public abstract void teach();

    public Coach() {
    }

    public Coach(String name, int age) {
        super(name, age);
    }
}
