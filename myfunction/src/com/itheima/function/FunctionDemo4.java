package com.itheima.function;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 功能:
 * 作者:
 * 日期:2024/05/12 18:58
 */
public class FunctionDemo4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        Collections.addAll(list, "aaa", "bbb", "ccc");

        list.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}
