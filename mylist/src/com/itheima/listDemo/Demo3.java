package com.itheima.listDemo;

import java.util.ArrayList;

/**
 * 功能:
 * 作者:
 * 日期:2024/04/13 18:59
 */
public class Demo3 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student s1 = new Student("zhangsan", 23);
        Student s2 = new Student("lisi", 23);
        Student s3 = new Student("wangwu", 23);
        Student s4 = new Student("zhaoliu", 23);

        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName()+ " , "+ list.get(i).getAge());

        }
    }
}
