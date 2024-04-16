package com.itheima.test;

/**
 * 功能:
 * 作者:
 * 日期:2024/04/07 15:58
 */
public class Test6 {
    public static void main(String[] args) {
        // 把整数的每一位都添加到数组中
        int number = 12345;
        int count = 0;
        int tmp = number;
        while (tmp != 0) {
            tmp = tmp / 10;
//            System.out.println(tmp);
            count++;
        }

//        System.out.println(count);

        int [] arr = new int[count];

        tmp = number;
        int i =arr.length -1;
        while(tmp !=0){
            arr[i] = tmp%10;
            tmp = tmp/10;
           i--;
        }

        for (int i1 = 0; i1 < arr.length; i1++) {
            System.out.print(arr[i1] + " ");
        }
    }
}
