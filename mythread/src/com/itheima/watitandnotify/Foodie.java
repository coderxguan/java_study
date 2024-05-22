package com.itheima.watitandnotify;

/**
 * 功能:
 * 作者:
 * 日期:2024/05/20 19:44
 */
public class Foodie extends Thread{
    @Override
    public void run(){

        while (true){
            synchronized (Desk.lock){
                if(Desk.count == 0){
                    break;
                }else {
                    if(Desk.foodFlag == 0){
                        try {
                            Desk.lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        Desk.lock.notify();
                    }else {
                        Desk.count --;

                        System.out.println("在吃面条, 还能再吃" + Desk.count + "碗!!!");
                        Desk.lock.notify();


                        Desk.foodFlag = 0;

                    }
                }
            }
        }
    }
}
