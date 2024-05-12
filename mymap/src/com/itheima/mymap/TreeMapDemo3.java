package com.itheima.mymap;

import java.util.TreeMap;
import java.util.function.BiConsumer;

/**
 * 功能:
 * 作者:
 * 日期:2024/05/10 10:35
 */
public class TreeMapDemo3 {
    public static void main(String[] args) {
        String str = "axhighsiahgissihsdhisegh";

        TreeMap<Character, Integer> tm = new TreeMap<>();

        for (char c : str.toCharArray()) {
            if(tm.containsKey(c)){
                int value = tm.get(c);
                value ++;
                tm.put(c, value);
            }
            else{
                tm.put(c, 1);
            }
        }

        StringBuilder sb = new StringBuilder();

        tm.forEach((character,integer)-> sb.append(character).append("(").append(integer).append(") "));

        System.out.println(sb.toString());
    }
}
