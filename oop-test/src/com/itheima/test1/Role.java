package com.itheima.test1;

import java.util.Random;

/**
 * 功能:
 * 作者:
 * 日期:2024/04/10 20:37
 */
public class Role {
    private String name;
    private int blood;

    public Role() {
    }

    public Role(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }


    // define a method to attack others
    public void attack(Role role) {
        // calculate the hurt
        Random r = new Random();
        int hurt = r.nextInt(20) + 1;

        // modify the beaten person blood
        int remainBlood = role.getBlood() - hurt;
        // verify the remainBlood, minus to zero
        remainBlood = remainBlood < 0 ? 0 : remainBlood;
        role.setBlood(remainBlood);



        System.out.println(this.getName() +  "举起拳头, 打了" + role.getName() + "一下, " +
                "造成了" +hurt + "点伤害, " + role.getName() +  "还剩下" +remainBlood + "点血");
    }
}
