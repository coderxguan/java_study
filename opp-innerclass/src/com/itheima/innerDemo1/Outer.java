package com.itheima.innerDemo1;

/**
 * 功能:
 * 作者:
 * 日期:2024/04/18 14:43
 */
public class Outer {
    String name;
    private class Inner{
        static int a = 10;


    }

    public Inner getInstance(){
        return new Inner();
    }
}
