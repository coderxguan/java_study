package com.itheima.mybytestream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * 功能:
 * 作者:
 * 日期:2024/05/14 21:14
 */
public class ByteStreamDemo6 {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("myio\\a.txt");

        int b;

        while ((b = fis.read()) != -1){
            System.out.println((char)b);
        }

        while((b = fis.read()) != -1){
            System.out.println();
        }
    }

}
