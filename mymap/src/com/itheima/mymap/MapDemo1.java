package com.itheima.mymap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 功能:
 * 作者:
 * 日期:2024/05/07 21:16
 */
public class MapDemo1 {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        map.put("a", "b");
        map.put("b", "c");
        map.put("c", "d");
        map.put("d", "e");


        Set<Map.Entry<String, String>> entries = map.entrySet();


    }
}
