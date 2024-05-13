package com.itheima.myfile;

import java.io.File;

/**
 * 功能:
 * 作者:
 * 日期:2024/05/13 19:01
 */
public class FileDemo3 {
    public static void main(String[] args) {

        File f1 = new File("D:\\Documents\\a.txt");
        long len = f1.length();
        System.out.println(len);
    }
}
