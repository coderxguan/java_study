package com.itheima.mycollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

/**
 * 功能:
 * 作者:
 * 日期:2024/04/26 19:50
 */
public class CollectionDemo2 {
    public static void main(String[] args) {
        Collection<Student> coll = new ArrayList<>();


        Student s1 = new Student("zhangsan", 23);
        Student s2 = new Student("zhangsan", 23);
        Student s3 = new Student("zhangsan", 23);

        coll.add(s1);
        coll.add(s2);
        coll.add(s3);

        Student s4 = new Student("zhangsan", 23);
        coll.add(s4);


        coll.forEach(s-> System.out.println(s));


    }
}
