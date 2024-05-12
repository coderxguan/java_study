package com.itheima.mystream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

/**
 * 功能:
 * 作者:
 * 日期:2024/05/11 21:24
 */
public class StreamDemo2 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "a", "b", "c", "d", "e");


         list.stream().forEach(s-> System.out.println(s));
    }
}
