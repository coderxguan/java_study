package com.itheima.test;

import java.io.File;

/**
 * 功能:
 * 作者:
 * 日期:2024/05/13 21:12
 */
public class Test5 {
    public static void main(String[] args) {
        File file = new File("D:\\Documents\\book");

        System.out.println(getLen(file));
    }

    public static long getLen(File src){
        long len = 0;
        File[] files = src.listFiles();

        for (File file : files) {
            if(file.isFile()){
                len += file.length();
            }else{
                return len + getLen(file);
            }
        }
        return len;

    }
}
