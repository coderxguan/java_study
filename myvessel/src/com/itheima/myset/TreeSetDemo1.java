package com.itheima.myset;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * 功能:
 * 作者:
 * 日期:2024/04/28 22:39
 */
public class TreeSetDemo1 {
    public static void main(String[] args) {

        // create TreeSet object

        TreeSet<Integer> ts = new TreeSet<>();


        ts.add(3);
        ts.add(4);
        ts.add(1);
        ts.add(6);
        ts.add(2);

        Iterator<Integer> it = ts.iterator();

        while(it.hasNext()){
            int i = it.next();
            System.out.println(i);
        }


        System.out.println("----------------------");


        for (Integer t : ts) {
            System.out.println(t);
        }


        System.out.println("----------------");

        ts.forEach(System.out::println);
    }
}
