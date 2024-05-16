package com.itheima.myconvertstream;

import jdk.swing.interop.SwingInterOpUtils;

import java.io.*;

/**
 * 功能:
 * 作者:
 * 日期:2024/05/16 15:09
 */
public class ConvertStreamDemo4 {
    public static void main(String[] args) throws IOException {

//        FileInputStream fis = new FileInputStream("myio\\a.txt");
//        InputStreamReader isr = new InputStreamReader(fis);
//        BufferedReader br = new BufferedReader(isr);
//
//        String str = br.readLine();
//        System.out.println(str);
//        br.close();


        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("myio\\a1.txt")));
        String line;
        while ((line = br.readLine()) != null){
            System.out.println(line);
        }

        br.close();



    }

}
