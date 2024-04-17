package com.itheima.abstractDemo1;

/**
 * 功能:
 * 作者:
 * 日期:2024/04/17 19:44
 */
public class Student extends Person{
    @Override
    public void work() {
        System.out.println("学生的工作是学习");

    }

    public Student(String name, int age) {
        super(name, age);
    }

    public Student() {
    }
}
