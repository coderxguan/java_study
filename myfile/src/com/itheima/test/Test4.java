package com.itheima.test;

import java.io.File;

/**
 * 功能:
 * 作者:
 * 日期:2024/05/13 20:53
 */
public class Test4 {
    public static void main(String[] args) {
        File file = new File("D:\\Documents\\bbb\\a");
        delete(file);
    }


    public static void delete(File src){
        File[] files = src.listFiles();

        for (File file : files) {
            if(file.isFile()){
                file.delete();
            }else{
                delete(file);
            }
        }
        src.delete();
    }

}
