package com.itheima.test1;

/**
 * 功能:
 * 作者:
 * 日期:2024/05/20 20:29
 */
public class Test1 {

        public static void main(String[] args) {



                MyThread t1 = new MyThread();
                MyThread t2 = new MyThread();
                MyThread t3 = new MyThread();
                MyThread t4 = new MyThread();
                MyThread t5 = new MyThread();


                t1.setName("111");
                t2.setName("222");
                t3.setName("333");
                t4.setName("444");
                t5.setName("555");

                 t1.start();
                 t2.start();
                 t3.start();
                 t4.start();
                 t5.start();







    }
}
