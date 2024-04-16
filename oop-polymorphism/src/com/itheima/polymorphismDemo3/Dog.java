package com.itheima.polymorphismDemo3;

/**
 * 功能:
 * 作者:
 * 日期:2024/04/16 20:20
 */
public class Dog extends Animal{


    public Dog() {
    }

    public Dog(int age, String color) {
        super(age, color);
    }
    @Override
     public void eat(String something){
         System.out.println(super.getAge() + "岁的" + super.getColor() + "颜色的狗两只前腿死死的抱住" +something + "猛吃");

     }

     public void lookHome(){
         System.out.println("狗在看家");
     }
}
