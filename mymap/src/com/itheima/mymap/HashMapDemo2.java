package com.itheima.mymap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

/**
 * 功能:
 * 作者:
 * 日期:2024/05/09 20:55
 */
public class HashMapDemo2 {
    public static void main(String[] args) {
        String [] arr = {"A", "B", "C", "D"};

        ArrayList<String> list = new ArrayList<>();

        Random r = new Random();
        for (int i = 0; i < 80; i++) {
            int index = r.nextInt(arr.length);
            list.add(arr[index]);
        }

        HashMap<String, Integer> hm = new HashMap<>();
        for (String name : list) {
            if(hm.containsKey(name)){
                int count = hm.get(name);
                count ++;

                hm.put(name, count);

            }else {
                hm.put(name,1);
            }
        }


        System.out.println(hm);

    }
}
