package com.itheima.test;

import com.itheima.ui.RegisterJFrame;

import java.util.Random;

/**
 * 功能:
 * 作者:
 * 日期:2024/04/19 22:12
 */
public class Test {
    public static void main(String[] args) {
        // disorder the one dimensional array 0 ~ 15
        // set of four into two-dimensional array


        // define a one dimensional array
        int [] tempArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        // disorder arr
        // for each arr, take an element switch with a random index
        Random r = new Random();
        for(int i = 0; i < tempArr.length; i++){
            // get random index
            int index = r.nextInt(tempArr.length);
            // switch two element
            int temp = tempArr[i];
            tempArr[i] = tempArr[index];
            tempArr[index] = temp;
        }

        for (int i = 0; i < tempArr.length; i++) {
            System.out.print(tempArr[i] + ", ");

        }
        System.out.println();

        // add to two-dimensional array
        int [][] data = new int[4][4];
        for (int i = 0; i < tempArr.length; i++) {
            data[i / 4][i % 4] = tempArr[i];
        }

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + ",");
            }
            System.out.println();
        }


    }
}
