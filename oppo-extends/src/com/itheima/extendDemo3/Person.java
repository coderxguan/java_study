package com.itheima.extendDemo3;

/**
 * 功能:
 * 作者:
 * 日期:2024/04/15 22:33
 */
public class Person {
    String name;
    int age;

    public Person() {
        System.out.println("parent class no parameter construction");
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
