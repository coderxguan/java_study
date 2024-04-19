package com.itheima.innerDemo5;

/**
 * 功能:
 * 作者:
 * 日期:2024/04/18 18:05
 */
public class Test {
    public static void main(String[] args) {

//        new Swim(){
//
//            @Override
//            public void swim() {
//                System.out.println("重写了游泳的方法");
//            }
//        };
//
//
//
//        new Animal(){
//
//            @Override
//            public void eat() {
//                System.out.println("重写了eat方法");
//            }
//        };

        method(
          new Animal(){

              @Override
              public void eat() {
                  System.out.println("狗吃骨头");
              }
          }
        );


    }

    public static void method(Animal a){
        a.eat();
    }
}
