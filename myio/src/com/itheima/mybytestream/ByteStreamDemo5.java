package com.itheima.mybytestream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 功能:
 * 作者:
 * 日期:2024/05/14 21:05
 */
public class ByteStreamDemo5 {
    public static void main(String[] args) throws IOException {


        FileInputStream fis = new FileInputStream("myio\\a.txt");

        int b1 = fis.read();
        System.out.println(b1);

        fis.close();
    }
}
