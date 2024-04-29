package com.itheima.myset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;

/**
 * 功能:
 * 作者:
 * 日期:2024/04/28 14:47
 */
public class MySetDemo1 {
    public static void main(String[] args) {


        Set<String> s = new HashSet<>();

        // add
        boolean r1 = s.add("zhangsan");
        s.add("lisi");
        s.add("wangwu");


        Iterator<String> it = s.iterator();


//        while(it.hasNext()){
//            String str = it.next();
//            System.out.println(str);
//        }
//
//        for (String s1 : s) {
//            System.out.println(s1);
//        }


        s.forEach(System.out::println);






        System.out.println(s);

    }
}
