package com.itheima.Test;

import java.util.Arrays;

/**
 * 功能:
 * 作者:
 * 日期:2024/04/26 12:50
 */
public class Test6 {
    public static void main(String[] args) {

        girlFriend gf1 = new girlFriend("aaa", 18, 1.67);
        girlFriend gf2 = new girlFriend("bad", 19, 1.73);
        girlFriend gf3 = new girlFriend("ccd", 19, 1.78);


        girlFriend[] arr = {gf1, gf2, gf3};

        Arrays.sort(arr, (g1, g2)->{
            if(g1.getAge() == g2.getAge()){
                if(g1.getHeight() == g2.getHeight()){
                    return g1.getName().compareTo(g2.getName());
                }
                else{
                    return (int)(g2.getHeight()*100) - (int)(g1.getHeight()*100);
                }
            }
            else{
                return g1.getAge() - g2.getAge();
            }
        });


        System.out.println(Arrays.toString(arr));

    }
}

class girlFriend{
    private String name;
    private int age;
    private double height;

    public girlFriend() {
    }

    public girlFriend(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return height
     */
    public double getHeight() {
        return height;
    }

    /**
     * 设置
     * @param height
     */
    public void setHeight(double height) {
        this.height = height;
    }

    public String toString() {
        return "girlFriend{name = " + name + ", age = " + age + ", height = " + height + "}";
    }
}
