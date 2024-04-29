package com.itheima.myset;

/**
 * 功能:
 * 作者:
 * 日期:2024/04/28 15:03
 */
public class HashSetDemo1 {
    public static void main(String[] args) {


        Student s1 = new Student("zhangsan", 18);
        Student s2 = new Student("zhangsan", 18);

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());


        System.out.println("abc".hashCode());

        System.out.println("acD".hashCode());
    }
}
