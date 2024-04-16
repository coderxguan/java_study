package com.itheima.switchdemo;

/**
 * 功能:
 * 作者:
 * 日期:2024/04/02 21:45
 */
public class SwitchDemo {
    public static void main(String[] args) {
        int num = 1;
        switch (num) {
// 大括号可省略
            case 1 -> {
                System.out.println("一");
            }
            case 2 -> {
                System.out.println("二");
            }
            case 3 -> System.out.println("三");
            default -> System.out.println("没有这种选项");

        }

    }
}
