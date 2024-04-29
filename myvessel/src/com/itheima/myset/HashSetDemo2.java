package com.itheima.myset;

import java.util.HashSet;

/**
 * 功能:
 * 作者:
 * 日期:2024/04/28 15:24
 */
public class HashSetDemo2 {
    public static void main(String[] args) {

        Student s1 = new Student("zhangsan", 23);
        Student s2 = new Student("lisi", 24);
        Student s3 = new Student("wangwu", 25);
        Student s4 = new Student("zhangsan", 23);


        HashSet<Student> hs = new HashSet<>();

        System.out.println(hs.add(s1));
        System.out.println(hs.add(s2));
        System.out.println(hs.add(s3));
        System.out.println(hs.add(s4));


        System.out.println(hs);

    }
}
