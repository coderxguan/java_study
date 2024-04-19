package com.itheima.innerDemo5;

/**
 * 功能:
 * 作者:
 * 日期:2024/04/18 20:41
 */
public class Test2 {


    public static void main(String[] args) {

        new Swim(){

            @Override
            public void swim() {
                System.out.println("重写之后的游泳方法");
            }
        }.swim();







    }
}
