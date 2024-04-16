package com.itheima.test2;

import java.util.Scanner;

/**
 * 功能:
 * 作者:
 * 日期:2024/04/12 22:04
 */
public class Test1 {
    public static void main(String[] args) {
        String str;


        while(true){
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入一个字符串");
            str = sc.next();
            if(checkStr(str)){
                break;
            }else{
                System.out.println("输入的字符串不符合规则, 请重新输入");
            }
        }
        StringBuilder sb = new StringBuilder();


        for (int i = 0; i < str.length(); i++) {
            String s = changeRoman(str.charAt(i) -'0');
            sb.append(s);
        }

        System.out.println(sb.toString());






    }

    public static String changeRoman(int number){
        String[] arr = {""," I ", " II ", " III ", " IV ", " V ", " VI ", " VII ", " VIII ", " IX "};
        return arr[number];
    }

    public static boolean checkStr(String str){
        if(str.length()>9){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c < '0' || c >'9'){
                return false;
            }

        }
        return true;
    }
}
