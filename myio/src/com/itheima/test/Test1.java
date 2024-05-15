package com.itheima.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.FieldPosition;

/**
 * 功能:
 * 作者:
 * 日期:2024/05/15 20:22
 */
public class Test1 {
    public static void main(String[] args) throws IOException {

        File src = new File("D:\\Documents\\bbb");
        File dest = new File("D:\\Documents\\ccc");

        copydir(src, dest);
    }


    private static void copydir(File src, File dest) throws IOException {
        dest.mkdirs();

        File[] files = src.listFiles();


        for (File file : files) {
            if(file.isFile()){
                FileInputStream fis = new FileInputStream(file);
                FileOutputStream fos = new FileOutputStream(new File(dest, file.getName()));

                byte[] bytes = new byte[1024];
                int len;

                while((len = fis.read(bytes)) != -1){
                    fos.write(bytes, 0, len);

                }
                fos.close();
                fis.close();
            } else {
                copydir(file, new File(dest, file.getName()));
            }
        }

    }
}
