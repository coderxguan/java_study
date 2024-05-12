package com.itheima.Collections;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 功能:
 * 作者:
 * 日期:2024/05/10 16:37
 */
public class CollectionsDemo1 {
    public static void main(String[] args) {


        ArrayList<String> list = new ArrayList<>();

        Collections.addAll(list, "agj", "asgeh", "ghei", "ghei");


        Collections.shuffle(list);

        System.out.println(list);
    }
}
