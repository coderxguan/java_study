package com.itheima.interfaceDemo2.interfaceDemo4;

/**
 * 功能:
 * 作者:
 * 日期:2024/04/17 20:48
 */
public abstract class Sporter extends Person{
    public Sporter() {
    }

    public Sporter(String name, int age) {
        super(name, age);
    }

    public abstract void study();

}
