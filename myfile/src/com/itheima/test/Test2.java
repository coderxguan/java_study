package com.itheima.test;

import java.io.File;

/**
 * 功能:
 * 作者:
 * 日期:2024/05/13 20:30
 */
public class Test2 {
    public static void main(String[] args) {
        File file = new File("myfile\\aaa");
        System.out.println(haveAVI(file));


    }

    public static boolean haveAVI(File file){
        File[] files = file.listFiles();
        for (File f : files) {
            if(f.isFile()&& f.getName().endsWith(".avi")){
                return true;
            }
        }

        return false;
    }
}
