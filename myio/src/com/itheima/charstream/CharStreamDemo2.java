package com.itheima.charstream;

import com.sun.source.tree.NewClassTree;

import java.io.FileReader;
import java.io.IOException;

/**
 * 功能:
 * 作者:
 * 日期:2024/05/15 19:09
 */
public class CharStreamDemo2 {
    public static void main(String[] args) throws IOException {


        FileReader fr = new FileReader("myio\\a.txt");


        char [] chars = new char[2];
        int len;
        while((len = fr.read(chars)) != -1){
            System.out.print(new String(chars, 0, len));
        }
        fr.close();
    }
}
