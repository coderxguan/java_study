package com.itheima.mybytestream;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * 功能:
 * 作者:
 * 日期:2024/05/14 21:29
 */
public class ByteStreamDemo8 {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("myio\\a.txt");

        byte[] bytes = new byte[2];

        int len = fis.read(bytes);

        System.out.println(new String(bytes));

        fis.close();


    }
}
