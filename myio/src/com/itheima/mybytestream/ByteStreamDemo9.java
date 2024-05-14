package com.itheima.mybytestream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 功能:
 * 作者:
 * 日期:2024/05/14 21:47
 */
public class ByteStreamDemo9 {
    public static void main(String[] args) {

        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
             fis = new FileInputStream("D:\\Documents\\bbb\\a.txt");
             fos = new FileOutputStream("myio\\aa.txt");

            int b ;
            while((b = fis.read())!= -1){
                fos.write(b);
            }
        } catch(IOException e) {
            e.printStackTrace();
        } finally {

            if(fos != null){
                try {
                    fos.close();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
            if(fis != null){
                try{
                    fis.close();
                } catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
