package com.itheima.sort;

/**
 * 功能:
 * 作者:
 * 日期:2024/04/25 20:02
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {6, 1, 2, 7, 9, 3, 4, 5, 10, 8};

        quickSort(arr, 0, arr.length -1);
        for (int i : arr) {
            System.out.print(i + ", ");
        }
    }

    public static void quickSort(int[] arr, int i, int j){
        int start = i;
        int end = j;

        if(start > end){
            return;
        }

        int baseNumber = arr[i];

        while(start != end){
            //
            while(true){
                if(end <=start || arr[end] < baseNumber){
                    break;
                }
                end --;
            }
            while (true) {
                if(end <= start || arr[start] > baseNumber){
                    break;
                }
                start++;
            }

            int tmp = arr[start];
            arr[start] = arr[end];
            arr[end] = tmp;
        }

        // 基准数归位
        int tmp = arr[start];
        arr[start] = arr[i];
        arr[i] = tmp;

        quickSort(arr, i, start -1);
        quickSort(arr, start + 1, j);
    }

}
