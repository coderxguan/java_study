package com.itheima.listDemo;

import java.util.ArrayList;

/**
 * 功能:
 * 作者:
 * 日期:2024/04/13 18:55
 */
public class Demo2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);


        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if(i == list.size() -1){
                System.out.print(list.get(i));
            }
            else{
                System.out.print(list.get(i) + ", ");
            }
        }
        System.out.print("]");
    }
}
