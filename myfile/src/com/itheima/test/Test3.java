package com.itheima.test;

import java.io.File;

/**
 * 功能:
 * 作者:
 * 日期:2024/05/13 20:36
 */
public class Test3 {
    public static void main(String[] args) {

        findAVI();


    }

    public static void findAVI(){
        File[] arr = File.listRoots();
        for (File file : arr) {
            findAVI(file);
        }
    }


    public static void findAVI(File src){
        File[] files = src.listFiles();
        if(files == null){
            return ;
        }

        for (File file : files) {
            if(file.isFile()){
                String name = file.getName();
                if(name.endsWith(".avi")){
                    System.out.println(file);
                }else{
                    findAVI(file);
                }
            }
        }
    }
}
