package com.itheima.test2;

/**
 * 功能:
 * 作者:
 * 日期:2024/04/09 20:32
 */
public class Student {
    private String name;
    private int age;

    public Student(){
        System.out.println("execute");
    }

    public Student(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("parameter");
    }


    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;

    }
}
