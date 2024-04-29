package com.guan.training;

import java.util.Scanner;

/**
 * 功能:
 * 作者:
 * 日期:2024/04/28 10:27
 */
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(Compare(sc.nextInt(),sc.nextInt()));
        System.out.println(Compare(sc.next().charAt(0), sc.next().charAt(0)));
        System.out.println(Compare(sc.next(), sc.next()));

    }
    public static int Compare(int a, int b){
        return Math.max(a, b);
    }

    public static int Compare(char a, char b){
        return Math.abs(a -b);
    }

    public static String Compare(String a, String b){
        if(a.compareTo(b) > 0){
            return a;
        }else{
            return b;
        }
    }

}

