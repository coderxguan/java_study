package com.itheima.extendDemo3;

/**
 * 功能:
 * 作者:
 * 日期:2024/04/15 22:34
 */
public class Student extends Person{
    public Student(){
        super();
        System.out.println("subclass no parameter construction");
    }
    public Student(String name, int age){
        super(name, age);

    }
}
