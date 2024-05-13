package com.itheima.exception;

/**
 * 功能:
 * 作者:
 * 日期:2024/05/13 12:30
 */
public class ExceptionDemo6 {
    public static void main(String[] args) {

        int[] arr = null;

        int max = 0;
        try {
            max = getMax(arr);
        } catch (NullPointerException e) {
            System.out.println("空指针");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("索引越界异常");
        }
        System.out.println(max);

    }

    public static int getMax(int[] arr){
        if(arr == null){
            throw new NullPointerException();
        }
        if(arr.length == 0){
            throw new ArrayIndexOutOfBoundsException();
        }
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }


}
