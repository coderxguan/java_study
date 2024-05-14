package com.itheima.mybytestream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 功能:
 * 作者:
 * 日期:2024/05/14 20:27
 */
public class ByteStreamDemo1 {
    public static void main(String[] args) throws IOException {

        FileOutputStream fos = new FileOutputStream("myio\\a.txt");
        fos.write(97);
        fos.close();




    }
}
