package com.itheima.LambdaDemo;

/**
 * 功能:
 * 作者:
 * 日期:2024/04/26 12:27
 */
public class Demo2 {
    public static void main(String[] args) {


        method(()->{
            System.out.println("swimming");
        });



    }


    public static void method(Swim s){
        s.swimming();
    }
}


interface Swim{
    public abstract void swimming();


}
