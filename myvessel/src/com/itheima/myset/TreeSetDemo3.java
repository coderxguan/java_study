package com.itheima.myset;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * 功能:
 * 作者:
 * 日期:2024/04/29 19:25
 */
public class TreeSetDemo3 {
    public static void main(String[] args) {

        TreeSet<String> ts = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int i = o1.length() - o2.length();

                return i == 0 ? o1.compareTo(o2) : i;
            }
        });

        ts.add("c");
        ts.add("ab");
        ts.add("df");
        ts.add("qwer");


        System.out.println(ts);
    }
}
