package com.itheima.staticDemo2;

/**
 * 功能:
 * 作者:
 * 日期:2024/04/14 21:01
 */
public class ArrayUtil {
    private ArrayUtil(){}

    public static String printArr(int [] arr){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length - 1){
                sb.append(arr[i]);
            }else{
                sb.append(arr[i]).append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }


    public static double getAverage(double[] arr){
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum +=arr[i];
        }
        return sum / arr.length;

    }
}
