package com.itheima.sort;

/**
 * 功能:
 * 作者:
 * 日期:2024/04/25 19:41
 */
public class InsertSort {
    public static void main(String[] args) {
        int [] arr = {16, 5, 9, 12, 21, 18,
                32, 23, 37, 26, 45, 34,
                50, 48, 61, 52, 73, 66};

        int startIndex = -1;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < arr[i-1]){
                startIndex = i;
                break;
            }
        }


        for(int i = startIndex; i < arr.length; i++){
            int j = i;
            while(j > 0 && arr[j] < arr[j-1]){
                int tmp = arr[j] ;
                arr[j] = arr[j-1];
                arr[j-1] = tmp;
                j--;
            }
        }


        print(arr);

    }

    public static void print(int[] arr){
        for (int i : arr) {
            System.out.print(i+", ");
        }
    }
}
