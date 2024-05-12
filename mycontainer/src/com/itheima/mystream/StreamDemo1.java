package com.itheima.mystream;

import java.util.ArrayList;

/**
 * 功能:
 * 作者:
 * 日期:2024/05/11 21:11
 */
public class StreamDemo1 {
    public static void main(String[] args) {


        ArrayList<String> list = new ArrayList<>();

        list.add("张无忌");
        list.add("周芷若");
        list.add("赵墩");
        list.add("张强");
        list.add("张三丰");

//        ArrayList<String> list2 = new ArrayList<>();
//
//        for (String name : list) {
//            if(name.startsWith("张"))
//                list2.add(name);
//        }
//
//
//        ArrayList<String> list3 = new ArrayList<>();



        list.stream().filter(name->name.startsWith("张")).filter(
                name ->name.length() == 3).forEach(name-> System.out.println(name));


    }
}
