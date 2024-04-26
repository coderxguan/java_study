package com.itheima.search;

/**
 * 功能:
 * 作者:
 * 日期:2024/04/25 19:07
 */
public class SearchDemo2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int num = 0;
        System.out.println(binarySearch(arr, num));

    }

    public static boolean binarySearch(int[] arr, int num){
        int mid = arr.length / 2;
        // close left and open right
        int left = 0;
        int right = arr.length;

        while(left < right){
            if(num == arr[mid]){
                return true;
            }
            else if(num > arr[mid]){
                left = mid + 1;
                mid = (left + right) / 2;
            }else{
                right = mid;
                mid = (left + right) / 2;
            }
        }

        return false;
    }
}
