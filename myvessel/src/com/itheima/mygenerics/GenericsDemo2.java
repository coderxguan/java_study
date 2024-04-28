package com.itheima.mygenerics;

/**
 * 功能:
 * 作者:
 * 日期:2024/04/27 23:12
 */
public class GenericsDemo2 {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();


        list.add("add");
        list.add("bcc");
        list.add("caa");

        System.out.println(list);
        System.out.println(list.get(1));
    }
}
