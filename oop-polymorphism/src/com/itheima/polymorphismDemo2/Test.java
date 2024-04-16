package com.itheima.polymorphismDemo2;

import java.util.ArrayList;

/**
 * 功能:
 * 作者:
 * 日期:2024/04/16 19:47
 */
public class Test {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.eat();
        if(a instanceof Dog d){
            d.lookHome();
        }
        else if(a instanceof Cat c){
            c.catchMouse();
        }else{
            System.out.println("no this type, cannot convert");
        }



    }
}


class Animal{
    public void eat(){
        System.out.println("动物在吃东西");
    }
}

class Dog extends Animal{
    @Override
    public void eat(){
        System.out.println("eat bone");
    }

    public void lookHome(){
        System.out.println("dog look home");
    }
}

class Cat extends Animal{
    @Override
    public void eat(){
        System.out.println("eat fish");
    }

    public void catchMouse(){
        System.out.println("cat catch mouse");
    }
}
