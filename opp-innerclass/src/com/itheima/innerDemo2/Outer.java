package com.itheima.innerDemo2;

/**
 * 功能:
 * 作者:
 * 日期:2024/04/18 14:57
 */
public class Outer {
    private int a = 0;
    class Inner{
        private int a = 10;
        public void show(){
            int a = 30;
            System.out.println(Outer.this.a);
            System.out.println(this.a);
            System.out.println(a);

        }
    }
}
