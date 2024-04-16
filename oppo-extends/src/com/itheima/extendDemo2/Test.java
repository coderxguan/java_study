package com.itheima.extendDemo2;

/**
 * 功能:
 * 作者:
 * 日期:2024/04/15 17:29
 */
public class Test {

    public static void main(String[] args) {


        zi z2 = new zi("zhangssan", 23);
    }



}

class FU{
    String name;
    int age;

    public FU(){}

    public FU(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void eat(){
        System.out.println("chifan ");
    }

}


class zi extends FU  {

    public zi(String zhangssan, int i) {

    }

    @Override
    public void eat(){

    }
}
