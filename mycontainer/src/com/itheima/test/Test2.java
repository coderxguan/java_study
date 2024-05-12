package com.itheima.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * 功能:
 * 作者:
 * 日期:2024/05/12 10:00
 */
public class Test2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "zhangsan,23",
                "lisi,24", "wangwu,25");
        list.stream()
                .filter(s -> Integer.parseInt(s.split(",")[1]) >= 24)
                .collect(Collectors
                        .toMap(new Function<String, String>() {
                                              @Override
                                              public String apply(String s) {
                                                  return s.split(",")[0];
                                              }
                                          }, new Function<String, Integer>() {
                                              @Override
                                              public Integer apply(String s) {
                                                  return Integer.parseInt(s.split(",")[1]);
                                              }
                                          }
                ));

        Map<String, String> map = list.stream()
                .filter(s -> Integer.parseInt(s.split(",")[1]) >= 24)
                .collect(Collectors.toMap(
                        s -> s.split(",")[0],
                        s -> s.split(",")[1]));


        System.out.println( map);


    }
}
