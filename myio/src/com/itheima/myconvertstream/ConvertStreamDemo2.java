package com.itheima.myconvertstream;

import java.io.*;
import java.nio.charset.Charset;

/**
 * 功能:
 * 作者:
 * 日期:2024/05/16 14:50
 */
public class ConvertStreamDemo2 {

    public static void main(String[] args) throws IOException {

//        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("myio\\a.txt"), "gbk");
//
//
//        osw.write("你好, 你好");
//        osw.close();


        FileWriter fw = new FileWriter("myio\\c.txt", Charset.forName("GBK"));
        fw.write("你好你好");
        fw.close();

    }
}
