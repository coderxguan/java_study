package com.itheima.mygenerics;

import java.util.ArrayList;

/**
 * 功能:
 * 作者:
 * 日期:2024/04/27 19:59
 */
public class GenericsDemo3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        ListUtil.addAll(list, "aaa", "bbb", "ccc");

        System.out.println(list);
    }
}
