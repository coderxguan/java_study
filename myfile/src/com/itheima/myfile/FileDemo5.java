package com.itheima.myfile;

import java.io.File;

/**
 * 功能:
 * 作者:
 * 日期:2024/05/13 20:07
 */
public class FileDemo5 {
    public static void main(String[] args) {

        File f = new File("D:\\Documents\\bbb");

        File[] files = f.listFiles();
        for (File file : files) {
            System.out.println(file);
        }


    }
}
