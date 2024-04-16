package com.itheima.listDemo;

import java.util.ArrayList;

/**
 * 功能:
 * 作者:
 * 日期:2024/04/13 18:15
 */
public class Demo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        String result = list.get(0);


        System.out.println(result);
        System.out.println(list);


        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }



    }
}
