package com.itheima.test;

import java.util.Random;

/**
 * 功能:
 * 作者:
 * 日期:2024/04/07 12:36
 */
public class Test3 {
    public static void main(String[] args) {

        char[] chs = new char[52];
        for (int i = 0; i < chs.length; i++) {
            if(i <=25) {
                chs[i] = (char) (97 + i);
            }
            else{
                chs[i] = (char)(65 + i -26);
            }
        }
        String result = "";

        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            int randomIndex = r.nextInt(chs.length);
            result += chs[randomIndex];
        }

//        System.out.println(result);


        int number = r.nextInt(10);
        result += number;
        System.out.println(result);

    }
}
