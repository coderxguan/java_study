package com.itheima.mycommonsio;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * 功能:
 * 作者:
 * 日期:2024/05/17 11:14
 */
public class CommonsIODemo1 {
    public static void main(String[] args) throws IOException {


        File src = new File("myio\\a.txt");
        File dest = new File("myio\\copy.txt");
        FileUtils.copyFile(src, dest);
    }
}
