package com.itheima.polymorphismDemo2.polymorphismDemo1;

/**
 * 功能:
 * 作者:
 * 日期:2024/04/16 19:30
 */
public class Student extends Person {
    @Override
    public void show(){
        System.out.println("student's info: " + getName() + ", " + getAge());
    }
}
