package com.itheima.mymap;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 功能:
 * 作者:
 * 日期:2024/05/09 20:34
 */
public class HashMapDemo1 {
    public static void main(String[] args) {


        HashMap<Student, String> hm = new HashMap<>();

        Student s1 = new Student("zhangsna", 23);
        Student s2 = new Student("lisi", 23);
        Student s3 = new Student("wangwu", 34);

        hm.put(s1, "jiangsu");
        hm.put(s2,"zhejiang" );
        hm.put(s3, "hubei");

        Set<Student> keys = hm.keySet();
        for (Student key : keys) {
            String value = hm.get(key);
            System.out.println(key + " =" + value);
        }

        System.out.println("-----------------------");

        Set<Map.Entry<Student, String>> entries = hm.entrySet();
        for (Map.Entry<Student, String> entry : entries) {
            Student key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key +" = "+ value);
        }


        System.out.println("------------------------");

        hm.forEach((stu, s)-> System.out.println(stu + " = " + s));

    }
}
