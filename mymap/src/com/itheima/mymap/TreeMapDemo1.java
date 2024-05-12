package com.itheima.mymap;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * 功能:
 * 作者:
 * 日期:2024/05/10 10:14
 */
public class TreeMapDemo1 {
    public static void main(String[] args) {
        TreeMap<Integer, String> tm = new TreeMap<>((o1, o2) -> o1 - o2);
        tm.put(2, "aaa");
        tm.put(3, "bbb");
        tm.put(1, "ccc");

        System.out.println(tm);









    }
}
