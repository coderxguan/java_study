package com.itheima.args;

/**
 * 功能:
 * 作者:
 * 日期:2024/05/10 16:25
 */
public class ArgsDemo1 {
    public static void main(String[] args) {
        // 方法形参的个数可以发生变化

        getSum(1,2,3,4,5);


    }
    //底层为数组
    public static int getSum(int ... args){
        int sum  = 0;
        for (int arg : args) {
            sum += arg;
        }
        System.out.println(sum);
        return 0;
    }


}
