package com.itheima.extendDemo1;

/**
 * 功能:
 * 作者:
 * 日期:2024/04/14 22:43
 */
public class Test {
    public static void main(String[] args) {

        Ragdoll rd = new Ragdoll();
        rd.eat();
        rd.drink();
        rd.catchMouse();

        Husky h = new Husky();
        h.drink();
        h.eat();
        h.breakHome();
        h.lookHome();
    }
}
