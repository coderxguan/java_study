package com.itheima.myreflect1;

/**
 * 功能:
 * 作者:
 * 日期:2024/07/08 15:30
 */
public class MyReflectDemo1 {
    public static void main(String[] args) throws ClassNotFoundException {


        // 1. class.forName("全类名")
        Class clazz = Class.forName("com.itheima.myreflect1.Student");
        System.out.println(clazz);

        // 2. 类名.class
        Class clazz2 = Student.class;

        // 3. 对象.getClass()
        Student s = new Student();
        Class clazz3 = s.getClass();


    }
}
