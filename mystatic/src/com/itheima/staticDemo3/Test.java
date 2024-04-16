package com.itheima.staticDemo3;

import java.util.ArrayList;

/**
 * 功能:
 * 作者:
 * 日期:2024/04/14 21:11
 */
public class Test {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Student s1 = new Student("hangman", 23, "male");
        Student s2 = new Student("lisi", 24, "male");
        Student s3 = new Student("wang", 25, "male");

        list.add(s1);
        list.add(s2);
        list.add(s3);


        int maxAgeStudent = StudentUtil.getMaxAgeStudent(list);
        System.out.println(maxAgeStudent);
    }
}
