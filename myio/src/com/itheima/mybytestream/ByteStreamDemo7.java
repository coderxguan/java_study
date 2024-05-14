package com.itheima.mybytestream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 功能:
 * 作者:
 * 日期:2024/05/14 21:22
 */
public class ByteStreamDemo7 {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("D:\\Documents\\bbb\\a.txt");
        FileOutputStream fos = new FileOutputStream("myio\\aa.txt");

        int b ;
        while((b = fis.read())!= -1){
            fos.write(b);
        }

        fos.close();
        fis.close();




    }
}
