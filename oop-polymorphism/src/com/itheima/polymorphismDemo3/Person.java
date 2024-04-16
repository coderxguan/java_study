package com.itheima.polymorphismDemo3;

/**
 * 功能:
 * 作者:
 * 日期:2024/04/16 20:27
 */
public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Person{name = " + name + ", age = " + age + "}";
    }


//    public void keepPet(Dog dog, String something){
//        System.out.printf("年龄为%s岁的%s养了一只%s颜色的%s岁的狗", age, name, dog.getColor(), dog.getAge());
//        System.out.println();
//        dog.eat(something);
//    }
//    public void keepPet(Cat cat, String something){
//        System.out.printf("年龄为%s岁的%s养了一只%s颜色的%s岁的猫", age, name, cat.getColor(), cat.getAge());
//        System.out.println();
//        cat.eat(something);
//    }


    public void keepPet(Animal a, String something){


        System.out.printf("年龄为%s岁的%s养了一只%s颜色的%s岁的动物", age, name, a.getColor(), a.getAge());
        System.out.println();
        a.eat(something);
    }

}
