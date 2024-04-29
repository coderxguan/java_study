package com.itheima.myset;

import java.util.TreeSet;

/**
 * 功能:
 * 作者:
 * 日期:2024/04/28 22:50
 */
public class TreeSetDemo2 {
    public static void main(String[] args) {


        Student s1 = new Student("zhangsan", 23);
        Student s2 = new Student("lisi", 24);
        Student s3 = new Student("wangwu", 25);

        TreeSet<Student> ts = new TreeSet<>();

        ts.add(s1);

        ts.add(s3);
        ts.add(s2);
        System.out.println(ts);



    }
}
