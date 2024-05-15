package com.itheima.charstream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 功能:
 * 作者:
 * 日期:2024/05/15 19:04
 */
public class CharStreamDemo1 {
    public static void main(String[] args) throws IOException {


        FileReader fr = new FileReader("myio\\a.txt");

        int ch;

        while((ch = fr.read()) != -1){
            System.out.print((char)ch);
        }

        fr.close();


    }
}
