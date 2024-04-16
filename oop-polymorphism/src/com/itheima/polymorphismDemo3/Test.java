package com.itheima.polymorphismDemo3;

import com.itheima.polymorphismDemo3.Person;

/**
 * 功能:
 * 作者:
 * 日期:2024/04/16 20:31
 */
public class Test
{

    public static void main(String[] args) {
        Person p = new Person("老王", 25);
        Animal a = new Dog(2, "黑");
        p.keepPet((Dog) a, "骨头");


        Cat cat = new Cat();

        p.keepPet(cat, "小鱼干");



    }
}
