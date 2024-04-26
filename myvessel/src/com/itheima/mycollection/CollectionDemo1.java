package com.itheima.mycollection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 功能:
 * 作者:
 * 日期:2024/04/26 19:45
 */
public class CollectionDemo1 {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();

         String s = "add";
         coll.add(s);

        System.out.println(coll);
    }
}
