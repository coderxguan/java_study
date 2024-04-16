package com.itheima.test5;

import java.util.Scanner;

/**
 * 功能:
 * 作者:
 * 日期:2024/04/10 21:50
 */
public class CarTest {
    public static void main(String[] args) {
        Car[] arr = new Car[3];
        String brand;
        int price;
        String color;

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            Car c = new Car();
            System.out.println("请输入第" + (i+1) + "辆车的品牌");
            brand = sc.next();
            c.setBrand(brand);
            System.out.println("请输入第" + (i+1) + "辆车的价格");
            price = sc.nextInt();
            c.setPrice(price);
            System.out.println("请输入第" + (i+1) + "辆车的颜色");
            color = sc.next();
            c.setColor(color);

            arr[i] = c;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println("第" + (i+1) + "辆车的品牌: "+ arr[i].getBrand() + " 价格: " + arr[i].getPrice() + " 颜色" + arr[i].getColor());

        }
    }
}
