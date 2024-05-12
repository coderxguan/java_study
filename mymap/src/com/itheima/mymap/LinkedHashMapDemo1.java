package com.itheima.mymap;

import java.util.LinkedHashMap;

/**
 * 功能:
 * 作者:
 * 日期:2024/05/10 10:06
 */
public class LinkedHashMapDemo1 {
    public static void main(String[] args) {

        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();

        lhm.put("a", 123);
        lhm.put("a", 111);
        lhm.put("b", 112);
        lhm.put("c", 143);

        System.out.println(lhm);

    }
}
