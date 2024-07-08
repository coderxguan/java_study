package com.itheima.myreflect2;

import java.lang.reflect.Constructor;

/**
 * 功能:
 * 作者:
 * 日期:2024/07/08 15:40
 */
public class MyReflectDemo {
    public static void main(String[] args) throws ClassNotFoundException {

        Class<?> aClass = Class.forName("com.itheima.myreflect2.Student");

//        Constructor<?>[] constructors = aClass.getConstructors();
//        for (Constructor<?> constructor : constructors) {
//            System.out.println(constructor);
//        }


//        Constructor<?>[] con2 = aClass.getDeclaredConstructors();
//        for (Constructor<?> con : con2) {
//            System.out.println(con);
//        }


        Student s = new Student();
    }
}
