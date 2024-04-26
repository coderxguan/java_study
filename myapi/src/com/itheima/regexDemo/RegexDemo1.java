package com.itheima.regexDemo;

/**
 * 功能:
 * 作者:
 * 日期:2024/04/23 20:49
 */
public class RegexDemo1 {
    public static void main(String[] args) {

        String qq ="2322333223";

        System.out.println(qq.matches("[1-9]\\d{5,19}"));
    }
}
