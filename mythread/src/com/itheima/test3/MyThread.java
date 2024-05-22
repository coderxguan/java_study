package com.itheima.test3;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 功能:
 * 作者:
 * 日期:2024/05/22 18:21
 */
public class MyThread extends Thread{

    ArrayList<Integer> list;

    public MyThread(ArrayList<Integer> list){
        this. list = list;
    }


    static ArrayList<Integer> list1 = new ArrayList<>();
    static ArrayList<Integer> list2 = new ArrayList<>();



    @Override
    public void run(){
        while(true){
            synchronized (com.itheima.test2.MyThread.class){
                if(list.size() == 0){
                    //抽奖结束
                    if("抽奖箱1".equals(getName())){
                        System.out.println("抽奖箱1" + list1);
                    }else{
                        System.out.println("抽奖箱2" + list2);

                    }
                    break;
                }else{
                    //继续抽奖
                    Collections.shuffle(list);
                    int prize = list.remove(0);
                    if("抽奖箱1".equals(getName())){
                        list1.add(prize);
                    }else {
                        list2.add(prize);
                    }
                }
            }

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}