package com.itheima.charstream;

import java.io.FileWriter;
import java.io.IOException;

/**
 * 功能:
 * 作者:
 * 日期:2024/05/15 19:20
 */
public class CharStreamDemo3 {
    public static void main(String[] args) throws IOException {

        FileWriter fw = new FileWriter("myio\\a.txt", true);

//        fw.write(25105);


//        fw.write("你好么???");

        char[] chars = {'a', 'b', 'c', '我'};
        fw.write(chars);

        fw.close();






        fw.close();



    }
}
