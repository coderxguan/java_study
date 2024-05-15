package com.itheima.mybufferedstream;

import java.io.*;

/**
 * 功能:
 * 作者:
 * 日期:2024/05/15 21:20
 */
public class BufferedStreamDemo1 {
    public static void main(String[] args) throws IOException {


        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("myio\\a.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("myio\\copy.txt"));

        int b ;
        while((b = bis.read())!=-1){
            bos.write(b);
        }

        byte[] bytes = new byte[1024];
        int len;
        while((len = bis.read()) != -1){
            bos.write(bytes, 0, len);
        }



        bos.close();
        bis.close();
    }
}
