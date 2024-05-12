package com.itheima.mystream;

import java.util.stream.Stream;

/**
 * 功能:
 * 作者:
 * 日期:2024/05/11 21:32
 */
public class StreamDemo5 {
    public static void main(String[] args) {
        Stream.of(1, 2, 3, 4, 5).forEach(s-> System.out.println(s));

    }
}
