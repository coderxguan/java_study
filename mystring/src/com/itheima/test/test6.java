package com.itheima.test;

import java.util.Scanner;

/**
 * 功能:
 * 作者:
 * 日期:2024/04/11 21:12
 */
public class test6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money;
        while (true) {
            System.out.println("请录入一个金额");
             money = sc.nextInt();
            if(money >= 0 && money <=9999999){
                break;
            }else{
                System.out.println("金额无效");
            }
        }
        String moneyStr = "";

        while(money != 0){
            int ge = money%10;
            String capitalNumber = getCapitalNumber(ge);
            moneyStr = capitalNumber + moneyStr;
            money /= 10;
        }


        int count = 7 - moneyStr.length();

        for (int i = 0; i < count; i++) {
            moneyStr = "零" + moneyStr;
        }



        String result = "";
        String[] arr ={"佰", "拾", "万", "仟","佰", "拾", "元" };

        for (int i = 0; i < arr.length; i++) {
            result += (moneyStr.charAt(i) + arr[i]);
        }

        System.out.println(result);

    }


    public static String getCapitalNumber(int number){
        String [] arr = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};

        return arr[number];

    }
}
