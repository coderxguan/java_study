package com.itheima.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 功能:
 * 作者:
 * 日期:2024/05/12 9:55
 */
public class Test1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 2, 3, 4,5, 6, 7, 8, 9);

        list.stream().filter(i->i%2==0).forEach(i-> System.out.println(i));
        List<Integer> newlist = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());

        System.out.println(newlist);
    }
}
