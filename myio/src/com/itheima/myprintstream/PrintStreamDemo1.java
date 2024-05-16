package com.itheima.myprintstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.nio.charset.Charset;

/**
 * 功能:
 * 作者:
 * 日期:2024/05/16 16:53
 */
public class PrintStreamDemo1 {
    public static void main(String[] args) throws FileNotFoundException {


        PrintStream ps = new PrintStream(new FileOutputStream("myio\\a.txt"), true, Charset.forName("UTF-8"));
        ps.println(97);
        ps.print(true);
        ps.printf("");
        ps.close();
    }
}
