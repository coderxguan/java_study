package com.itheima.mybytestream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 功能:
 * 作者:
 * 日期:2024/05/14 20:52
 */
public class ByteStreamDemo4 {
    public static void main(String[] args) throws IOException {

        FileOutputStream fos = new FileOutputStream("myio\\a.txt",true);


        String str = "hello world";
        byte[] arr = str.getBytes();

        fos.write(arr);


        fos.write("\r\n".getBytes());
        String str2 = "666";
        byte[] arr2 = str2.getBytes();
        fos.write(arr2);



        fos.close();

    }
}
