package com.itheima.function;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

/**
 * 功能:
 * 作者:
 * 日期:2024/05/12 11:38
 */
public class FunctionDemo2 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        Collections.addAll(list,"1", "2", "3", "4", "5");

        list.stream().map(Integer::parseInt).forEach(System.out::println);
    }
}
