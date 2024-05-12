package com.itheima.test;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 功能:
 * 作者:
 * 日期:2024/05/10 16:54
 */
public class Test2 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        Collections.addAll(list, 1,1,1,1,1,1,1,0,0,0);
        Collections.shuffle(list);


    }
}
