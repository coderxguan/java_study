package com.itheima.finalDemo2;

/**
 * 功能:
 * 作者:
 * 日期:2024/04/16 21:10
 */
public class Test {
    public static void main(String[] args) {


        final double PI = 3.14;

        final Student s = new Student("zhangsan", 15);

        System.out.println(s.toString());

        s.setName("lishi");
        s.setAge(23);

        System.out.println(s.toString());



    }
}
