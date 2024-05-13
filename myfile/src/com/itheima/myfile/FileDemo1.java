package com.itheima.myfile;

import java.io.File;

/**
 * 功能:
 * 作者:
 * 日期:2024/05/13 18:42
 */
public class FileDemo1 {
    public static void main(String[] args) {

        String str = "D:\\Desktop\\a.txt";
        File f1 = new File(str);
        System.out.println(f1);


        String parent = "D:\\Desktop";
        String child = "a.txt";

        File f22 = new File(parent, child);
        System.out.println(f22);


        File parent2 = new File("D:\\Desktop");
        String child2 = "a.txt";
        File f4 = new File(parent2, child2);
        System.out.println(f4);
    }
}
