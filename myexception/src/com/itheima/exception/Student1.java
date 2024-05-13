package com.itheima.exception;

/**
 * 功能:
 * 作者:
 * 日期:2024/05/13 10:50
 */
public class Student1 {
    private String name;
    private int age;

    public Student1() {
    }

    public Student1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        if(age<18 || age > 40){
            throw new RuntimeException();
        }else {
            this.age = age;
        }
    }

    public String toString() {
        return "Student1{name = " + name + ", age = " + age + "}";
    }
}
