package com.itheima.mymap;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * 功能:
 * 作者:
 * 日期:2024/05/10 10:25
 */
public class TreeMapDemo2 {
    public static void main(String[] args) {
        TreeMap<Student, String> tm = new TreeMap<>((o1, o2) -> {
            int i = o2.getAge() - o1.getAge();

            i = i == 0 ?o1.getName().compareTo(o2.getName()) : i;
            return i;
        });

        Student s1 = new Student("zhangsan", 21);
        Student s2 = new Student("lisi", 22);
        Student s3 = new Student("wangwu", 31);

        tm.put(s1, "jiangsu");
        tm.put(s2, "zhejiang");
        tm.put(s3, "hubei");


        System.out.println(tm);
    }
}
