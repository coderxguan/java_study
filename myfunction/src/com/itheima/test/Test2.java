package com.itheima.test;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 功能:
 * 作者:
 * 日期:2024/05/12 21:07
 */
public class Test2 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("zhangsan", 12));
        list.add(new Student("zhangsan", 12));
        list.add(new Student("zhangsan", 12));

        String[] arr = list.stream().map(Student::getName).toArray(String[]::new);

        System.out.println(Arrays.toString(arr));

    }
}
