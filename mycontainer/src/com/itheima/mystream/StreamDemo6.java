package com.itheima.mystream;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;

/**
 * 功能:
 * 作者:
 * 日期:2024/05/11 21:47
 */
public class StreamDemo6 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        Collections.addAll(list, "张无忌", "周芷若", "张强");

        list.stream().filter(s-> s.startsWith("张")).forEach(s-> System.out.println(s));
    }
}
