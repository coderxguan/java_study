package com.itheima.test6;

/**
 * 功能:
 * 作者:
 * 日期:2024/04/11 13:58
 */
public class PhoneTest {
    public static void main(String[] args) {
        Phone[] arr = new Phone[3];

        Phone p1 = new Phone("xiaomi", 1999, "white");
        Phone p2 = new Phone("huawei", 4999, "blue");
        Phone p3 = new Phone("meizu", 1999, "red");

        arr[0]  = p1;
        arr[1]  = p2;
        arr[2]  = p3;

        int sum = 0;


        for (int i = 0; i < arr.length; i++) {
            Phone phone = arr[i];
            sum = sum + phone.getPrice();

        }

        int avg = sum / arr.length;
        System.out.println(avg);

    }
}
