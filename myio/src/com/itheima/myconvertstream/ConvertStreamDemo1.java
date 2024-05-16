package com.itheima.myconvertstream;

import java.io.*;
import java.nio.charset.Charset;

/**
 * 功能:
 * 作者:
 * 日期:2024/05/16 14:42
 */
public class ConvertStreamDemo1 {
    public static void main(String[] args) throws IOException {

//        InputStreamReader isr = new InputStreamReader(new FileInputStream("myio\\b.txt"), "GBK");
//
//
//        int ch;
//        while((ch = isr.read()) != -1){
//            System.out.print((char)ch);
//        }
//        isr.close();


        FileReader fr = new FileReader("myio\\b.txt", Charset.forName("GBK"));
        int ch;
        while((ch = fr.read()) != -1){
            System.out.print((char)ch);
        }
        fr.close();

    }
}
