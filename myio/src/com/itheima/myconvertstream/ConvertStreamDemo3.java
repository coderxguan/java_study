package com.itheima.myconvertstream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

/**
 * 功能:
 * 作者:
 * 日期:2024/05/16 14:54
 */
public class ConvertStreamDemo3 {
    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("myio\\a.txt", Charset.forName("GBK"));
        FileWriter fw = new FileWriter("myio\\a1.txt", Charset.forName("UTF-8"));

        int ch;
        while((ch = fr.read()) != -1){
            fw.write(ch);
        }

        fw.close();
        fr.close();


    }

}
