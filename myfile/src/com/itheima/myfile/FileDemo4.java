package com.itheima.myfile;

import java.io.File;

/**
 * 功能:
 * 作者:
 * 日期:2024/05/13 19:51
 */
public class FileDemo4 {
    public static void main(String[] args) {


        File f2 = new File("D:\\Documents\\bbb\\ccc\\ddd\\eee");
        boolean b = f2.mkdirs();
        System.out.println(b);
    }
}
