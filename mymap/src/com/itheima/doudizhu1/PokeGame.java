package com.itheima.doudizhu1;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 功能:
 * 作者:
 * 日期:2024/05/10 20:28
 */
public class PokeGame {

   static ArrayList<String> list = new ArrayList<>();
    // 准备牌
    // static code block
    {
        String[] color = {"◇", "♣", "♠", "♥"};
        String[] number = {"3", "4", "5", "6", "7","8",
                "9", "10", "J", "Q", "K", "A", "2"};


        for (String s : color) {
            for (String n: number) {
                list.add(s +n);
            }
        }
        list.add("Little Joker");
        list.add("Big Joker");
    }

    public PokeGame() {
        // 洗牌
        Collections.shuffle(list);
        // 发牌
        ArrayList<String> lord = new ArrayList<>();
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            String poker = list.get(i);
            if(i <= 2) {
                lord.add(poker);
            }
            if(i %3 == 0){
                player1.add(poker);
            }
            else if(i % 3 == 1){
                player2.add(poker);
            }
            else {
                player3.add(poker);
            }
        }
        //  看牌
        lookPoker("底牌", lord);
        lookPoker("1", player1);
        lookPoker("2", player2);
        lookPoker("3", player3);

    }

    public void lookPoker(String name, ArrayList<String> list){
        System.out.print(name + ": ");

        for (String poker : list) {
            System.out.print(poker + " ");
        }
        System.out.println();
    }
}
