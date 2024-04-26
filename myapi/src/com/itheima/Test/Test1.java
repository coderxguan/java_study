package com.itheima.Test;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 功能:
 * 作者:
 * 日期:2024/04/25 14:44
 */
public class Test1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("请输入一个整数");
            String numStr = sc.nextLine();
            int num = Integer.parseInt(numStr);

            if(num < 1|| num > 100){
                System.out.println("input is invalid, input again");
                continue;
            }
            list.add(num);

            int sum = getSum(list);

            if(sum > 200) {
                System.out.println("data set already full");
                break;
            }
        }

        for (Integer integer : list) {
            System.out.print(integer + ", ");
        }

    }

    private static int getSum(ArrayList<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            Integer num = list.get(i);
            sum = sum + num;
        }

        return sum;
    }
}
