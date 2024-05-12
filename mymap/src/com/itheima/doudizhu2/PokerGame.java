package com.itheima.doudizhu2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

/**
 * 功能:
 * 作者:
 * 日期:2024/05/10 20:54
 */
public class PokerGame  {
    static HashMap<Integer, String> hm = new HashMap<>();
    static ArrayList<Integer> list = new ArrayList<>();

    static{
        String[] color = {"◇", "♣", "♠", "♥"};
        String[] number = {"3", "4", "5", "6", "7","8",
                "9", "10", "J", "Q", "K", "A", "2"};

        int serialNumber = 1;
        for (String n : number) {
            for (String s : color) {
                hm.put(serialNumber, s + n);
                list.add(serialNumber);
                serialNumber++;
            }
        }
         hm.put(serialNumber, "小王");
        list.add(serialNumber);
        serialNumber++;
        hm.put(serialNumber, "大王");
        list.add(serialNumber);

    }

    public PokerGame() {
        //洗牌
        Collections.shuffle(list);
        TreeSet<Integer> lord = new TreeSet<>();
        TreeSet<Integer> player1 = new TreeSet<>();
        TreeSet<Integer> player2 = new TreeSet<>();
        TreeSet<Integer> player3 = new TreeSet<>();

        for (int i = 0; i < list.size(); i++) {
            int serialNumber = list.get(i);
            if(i <=2) {
                lord.add(serialNumber);
                continue;
            }
            if(i %3 == 0) {
                player1.add(serialNumber);
            }
            else if(i % 3 == 1){
                player2.add(serialNumber);
            }else{
                player3.add(serialNumber);
            }
        }

        lookPoker("lord", lord);
        lookPoker("p1", player1);
        lookPoker("p2", player2);
        lookPoker("p3", player3);


    }



    public void lookPoker(String name, TreeSet<Integer> ts){
        System.out.print(name + ": ");
        for (Integer serialNumber : ts) {
            String poker = hm.get(serialNumber);
            System.out.print(poker + " ");
        }
        System.out.println();
    }





}
