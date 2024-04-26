package com.itheima.Test;

/**
 * 功能:
 * 作者:
 * 日期:2024/04/25 15:04
 */
public class Test3 {
    public static void main(String[] args) {
        System.out.println(toBinaryString(100));
    }

    public static String toBinaryString(int number){
        StringBuilder sb = new StringBuilder();

        while(true){
            if(number == 0){
                break;
            }
            int remainder = number %16;
            System.out.println(remainder);
            number = number / 16;
            sb.append(remainder);
        }
        sb.reverse();

        return sb.toString();
    }
}
