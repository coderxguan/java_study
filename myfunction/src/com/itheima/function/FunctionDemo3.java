package com.itheima.function;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;

/**
 * 功能:
 * 作者:
 * 日期:2024/05/12 17:11
 */
public class FunctionDemo3 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌", "周芷若", "赵明", "张强");

        list.stream().filter(s->s.startsWith("张"))
                .filter(s->s.length()==3).forEach(s-> System.out.println(s));

        list.stream().filter(new StringOperation() :: stringJudge)
                .forEach(System.out::println);

    }

    public boolean stringJudge(String s) {
        return s.startsWith("张")&& s.length() == 3;
    }


}
