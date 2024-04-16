package com.itheima.test;

import java.util.Scanner;

/**
 * 功能:
 * 作者:
 * 日期:2024/04/07 12:50
 */
public class Test4 {
    public static void main(String[] args) {

        int[] scoreArr = getScores();

        for (int i = 0; i < scoreArr.length; i++) {
            System.out.println(scoreArr[i]);
        }

        int max = getMax(scoreArr);
        int min = getMin(scoreArr);
        int sum = getSum(scoreArr);

        int result = (sum - max - min)/(scoreArr.length - 2);

        System.out.println("选手的最终得分" +result);

    }

    public static int getSum(int[] scoreArr){
        int sum = 0;
        for (int i = 0; i < scoreArr.length; i++) {
            sum += scoreArr[i];
        }
        return sum;
    }

    public static int getMax(int[] scoreArr){
        int max = scoreArr[0];
        for (int i = 1; i < scoreArr.length; i++) {
            if(scoreArr[i] > max){
                max = scoreArr[i];
            }
        }
        return max;
    }
    public static int getMin(int[] scoreArr){
        int min = scoreArr[0];
        for (int i = 1; i < scoreArr.length; i++) {
            if(scoreArr[i] < min){
                min = scoreArr[i];
            }
        }
        return min;
    }


    public static int[] getScores(){

        // 定义数组
        int [] scores = new int[6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < scores.length; ) {
            System.out.println("请输入第" + (i+1) + "个评委的打分");
            int score = sc.nextInt();
            if(score >=0 && score <=100)
            {
                scores[i] = score;
                i++;
            }
            else{
                System.out.println("非法成绩");
            }
        }

        return scores;
    }
}
