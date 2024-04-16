package com.itheima.polymorphismDemo3;

/**
 * 功能:
 * 作者:
 * 日期:2024/04/16 20:24
 */
public class Cat extends Animal{
    public Cat() {
    }

    public Cat(int age, String color) {
        super(age, color);
    }


    public void eat(String something){
        System.out.printf("%s岁的%s颜色的猫眯着眼睛侧着头吃%s", super.getAge(), super.getColor(), something );
    }

    public void catchMouse(){
        System.out.println("猫抓老鼠");
    }
}
