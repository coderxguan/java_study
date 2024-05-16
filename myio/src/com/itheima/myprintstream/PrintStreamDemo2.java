package com.itheima.myprintstream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 功能:
 * 作者:
 * 日期:2024/05/16 17:05
 */
public class PrintStreamDemo2 {
    public static void main(String[] args) throws IOException {

        PrintWriter pw = new PrintWriter(new FileWriter("myio\\a.txt"), true);

        pw.println("今天");

        pw.close();

    }
}
