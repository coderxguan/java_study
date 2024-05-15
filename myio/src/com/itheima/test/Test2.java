package com.itheima.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 功能:
 * 作者:
 * 日期:2024/05/15 20:33
 */
public class Test2 {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("myio\\ency.png");
        FileOutputStream fos = new FileOutputStream("myio\\redu.png");

        int b;

        while((b = fis.read()) != -1){
            fos.write(b ^2);
        }
        fos.close();
        fis.close();


    }
}
