package com.itheima.test1;

/**
 * 功能:
 * 作者:
 * 日期:2024/04/10 20:48
 */
public class GameTest {
    public static void main(String[] args) {
        // first role
        Role r1 = new Role("张三", 100);
        // second role
        Role r2 = new Role("李四", 100);

        // begin beating
        while(true){
            // r1 attack r2
            r1.attack(r2);
            if(r2.getBlood() == 0){
                System.out.println(r1.getName() + "K.O " + r2.getName());
                break;
            }

            //r2 attack r1
            r2.attack(r1);
            if(r1.getBlood() == 0){
                System.out.println(r2.getName() + "K.O " + r1.getName());
                break;
            }
        }
    }
}
