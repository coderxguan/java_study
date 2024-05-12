package com.itheima.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * 功能:
 * 作者:
 * 日期:2024/05/12 20:55
 */
public class Test1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        Collections.addAll(list, "张无忌,15", "周芷若,15");

        Student[] arr = list.stream().map(Student::new).toArray(Student[]::new);

        System.out.println(Arrays.toString(arr));
    }
}
