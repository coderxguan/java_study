package com.itheima.test;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * 功能:
 * 作者:
 * 日期:2024/05/12 10:08
 */
public class Test3 {
    public static void main(String[] args) {


        ArrayList<String> manList = new ArrayList<>();
        ArrayList<String> womenList = new ArrayList<>();
        //男演员只要三个字的前两个人
        Stream<String> stream1 = manList.stream()
                .filter(s -> s.split(",")[0].length() == 3)
                .limit(2);

        Stream<String> stream2 = womenList.stream().filter(s -> s.split(",")[0].startsWith("杨"))
                .skip(1);

        Stream.concat(stream1, stream2)
                .map(new Function<String, Actor>() {
                    @Override
                    public Actor apply(String s) {
                        String name = s.split(",")[0];
                        Integer age = Integer.parseInt(s.split(",")[1]);

                        return new Actor(name, age);
                    }
                }).forEach(s -> System.out.println(s));


        Stream.concat(stream1, stream2)
                .map( s -> new Actor(s.split(",")[0],
                        Integer.parseInt(s.split(",")[1]))
                ).forEach(s -> System.out.println(s));


    }
}
