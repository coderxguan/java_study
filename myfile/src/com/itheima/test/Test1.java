package com.itheima.test;

import java.io.File;
import java.io.IOException;

/**
 * 功能:
 * 作者:
 * 日期:2024/05/13 20:25
 */
public class Test1 {
    public static void main(String[] args) throws IOException {
        File file = new File("myfile\\aaa");
        file.mkdirs();

        File src = new File(file, "a.txt");
        boolean b = src.createNewFile();
        if(b){
            System.out.println("create successfully");
        }else
        {
            System.out.println("failed");
        }
    }
}
