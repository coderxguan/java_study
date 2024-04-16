package com.itheima.test2;

/**
 * 功能:
 * 作者:
 * 日期:2024/04/12 22:20
 */
public class Test2 {
    public static void main(String[] args) {
        String strA = "bcdea";
        String strB = "cdeab";
        int flag = 0;

        for (int i = 0; i < strA.length(); i++) {
            String rotate = rotate(strA);
            strA = rotate;
            if(rotate.equals(strB)){
                flag=1;

            }

        }
        if(flag == 1){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }

    }




    public static String rotate(String str){

        char first = str.charAt(0);
        String end = str.substring(1);
        return end + first;

    }
}
