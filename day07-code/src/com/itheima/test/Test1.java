package com.itheima.test;

import java.util.Scanner;

/**
 * 功能:
 * 作者:
 * 日期:2024/04/07 10:47
 */
public class Test1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票的原价");
        int ticket = sc.nextInt();
        System.out.println("请输入当前的月份");
        int month = sc.nextInt();
        System.out.println("请输入当前购买的舱位, 0 头等舱, 1 经济舱");
        int seat = sc.nextInt();

        if (month >= 5 && month <= 10) {
            // 旺季
//            ticket = getPrice(ticket, seat, 0.9, 0.85);
            ticket = getTicket(seat, ticket, 0.9, 0.85);
        } else if ((month >= 1 && month <= 4) || (month >= 11 && month <= 12)) {
            // 淡季
//            ticket = getPrice(ticket, seat, 0.7, 0.65);
            ticket = getTicket(seat, ticket, 0.7, 0.65);

        } else {
            // 录入非法数据1
            System.out.println("输入不合法");
        }
        System.out.println("机票的价格为: " + ticket);
    }

    private static int getTicket(int seat, int ticket, double x, double x1) {
        if (seat == 0) {
            ticket = (int) (ticket * x);
        } else if (seat == 1) {
            ticket = (int) (ticket * x1);
        } else {
            System.out.println("没有这个舱位");
        }
        return ticket;
    }


//    public static int getPrice(int ticket, int seat, double v0, double v1) {
//        if (seat == 0) {
//            ticket = (int) (ticket * v0);
//        } else if (seat == 1) {
//            ticket = (int) (ticket * v1);
//        } else {
//            System.out.println("没有这个舱位");
//            return 0;
//        }
//        return ticket;
//    }


}
