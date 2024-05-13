package com.itheima.myfile;

import java.io.File;

/**
 * 功能:
 * 作者:
 * 日期:2024/05/13 19:00
 */
public class FileDemo2 {
    public static void main(String[] args) {

        File f1= new File("D:\\Documents\\a.txt");
        System.out.println(f1.isDirectory());
        System.out.println(f1.isFile());
        System.out.println(f1.exists());


        File f2= new File("D:\\Documents\\a.txt");
        System.out.println(f1.isDirectory());
        System.out.println(f1.isFile());
        System.out.println(f1.exists());
    }
}
