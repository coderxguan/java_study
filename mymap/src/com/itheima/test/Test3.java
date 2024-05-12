package com.itheima.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * 功能:
 * 作者:
 * 日期:2024/05/10 17:02
 */
public class Test3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "aaa", "bbb", "ccc", "ddd", "eee", "fff", "ggg");

        Random r = new Random();
        int index = r.nextInt(list.size());
        String name = list.remove(index);
        System.out.println(name);
    }
}
