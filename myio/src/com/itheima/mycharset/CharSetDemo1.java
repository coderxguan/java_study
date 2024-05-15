package com.itheima.mycharset;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * 功能:
 * 作者:
 * 日期:2024/05/15 18:18
 */
public class CharSetDemo1 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("myio\\a.txt");

        int b ;
        while((b = fis.read()) != -1)
        {
            System.out.println((char)b);
        }

        fis.close();
    }
}
