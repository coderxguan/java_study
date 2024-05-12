package com.itheima.immutable;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 功能:
 * 作者:
 * 日期:2024/05/11 20:51
 */
public class ImmutableDemo2 {
    public static void main(String[] args) {

        Set<String> set = Set.of("zhang", "li", "wang");

        System.out.println(set);

        HashMap<String, String> hm = new HashMap();
        Map<Object, Object> map = Map.ofEntries(hm.entrySet().toArray(new Map.Entry[0]));
    }
}
