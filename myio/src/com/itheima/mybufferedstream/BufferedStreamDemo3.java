package com.itheima.mybufferedstream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 功能:
 * 作者:
 * 日期:2024/05/15 21:39
 */
public class BufferedStreamDemo3 {
    public static void main(String[] args) throws IOException {


        BufferedWriter bw = new BufferedWriter(new FileWriter("b.txt"));

        bw.write("你嘴角上扬的样子, 百度搜索不到");
        bw.newLine();
        bw.write("gheihgiweghweoigh");
         bw.newLine();
         bw.close();

    }
}
