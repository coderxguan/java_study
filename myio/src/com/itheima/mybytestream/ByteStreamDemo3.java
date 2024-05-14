package com.itheima.mybytestream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 功能:
 * 作者:
 * 日期:2024/05/14 20:47
 */
public class ByteStreamDemo3 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("myio\\a.txt");
        // file exist will be clear

        byte[] bytes = {90, 98, 96, 65};
//        fos.write(bytes);

        fos.write(bytes, 2, 2);

        fos.close();

    }
}
