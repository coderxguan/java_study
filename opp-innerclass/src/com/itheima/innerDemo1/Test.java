package com.itheima.innerDemo1;

/**
 * 功能:
 * 作者:
 * 日期:2024/04/18 14:43
 */
public class Test {

    public static void main(String[] args) {
       Outer o = new Outer();
        Object obj  = o.getInstance();

        System.out.println(obj);

    }
}
