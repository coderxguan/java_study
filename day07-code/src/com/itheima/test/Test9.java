package com.itheima.test;

import java.util.Random;
import java.util.Scanner;

/**
 * 功能:
 * 作者:
 * 日期:2024/04/07 16:20
 */
public class Test9 {
    public static void main(String[] args) {
        // 生成中奖号码
        int [] arr = createNumber();
        System.out.println("==============");
//        for (int k : arr) {
//            System.out.print(k + " ");
//        }
        System.out.println();
        System.out.println("==============");

        // 输入彩票号码
        int [] userInputArr = userInputNumber();

        int redCount = 0;
        int blueCount = 0;

        for(int i = 0; i < userInputArr.length - 1; i++){
            int redNumber = userInputArr[i];
            for (int j = 0; j < arr.length -1; j++) {
                if(redNumber == arr[j]){
                    // have found , just break
                    redCount ++;
                    break;
                }
            }
        }

        int blueNumber = userInputArr[userInputArr.length -1];
        if(blueNumber == arr[arr.length - 1]){
            blueCount ++;
        }

        if(redCount == 6 && blueCount == 1){
            System.out.println("恭喜你中奖1000万");
        }else if(redCount == 6 && blueCount == 0){
            System.out.println("恭喜你中奖500万");
        }else if(redCount == 5 && blueCount == 1){
            System.out.println("恭喜你中奖3000元");
        }else if((redCount == 5 && blueCount == 0) || (redCount == 4 && blueCount == 1)){
            System.out.println("恭喜你中奖200元");
        }else if((redCount == 4 && blueCount == 0) || (redCount == 3 && blueCount == 1)){
            System.out.println("恭喜你中奖10元");
        }else if((redCount == 2 && blueCount == 1) || (redCount == 1 && blueCount == 1) ||(redCount == 0 && blueCount == 1)){
            System.out.println("恭喜你中奖5元");
        }else{
            System.out.println("谢谢参与");
        }

    }

    public static int[] userInputNumber(){
        int[] arr = new int[7];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 6; ) {
            System.out.println("请输入第" + (i+1) + "个红球号码");
            int redNumber = sc.nextInt();

            if(redNumber >= 1 && redNumber <= 33){
                boolean flag = contains(arr, redNumber);
                if(!flag){
                    arr[i] = redNumber;
                    i++;
                }else{
                    System.out.println("当前红球号码已经存在");
                }

            }else{
                System.out.println("当前红球号码超出范围");
            }
        }

        System.out.println("请输入篮球号码");
        while (true) {
            int blueNumber = sc.nextInt();
            if(blueNumber >= 1 && blueNumber <=16){
                arr[arr.length - 1] = blueNumber;
                break;
            }
            else{
                System.out.println("当前篮球号码超出范围");
            }
        }

        return arr;
    }

    public static int[] createNumber(){
        //
        int [] arr = new int[7];

        Random r = new Random();
        for (int i = 0; i < 6; ) {
            int redNumber = r.nextInt(33) +1;
            boolean flag = contains(arr, redNumber);
            if(!flag){
                arr[i] = redNumber;
                i++;
            }
        }

        int blueNumber = r.nextInt(16) +1;
        arr[arr.length - 1] = blueNumber;

        return arr;
    }

    public static boolean contains(int [] arr, int number){
        for (int j : arr) {
            if (j == number) {
                return true;
            }

        }
        return false;
    }


}
