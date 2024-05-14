package com.itheima.mybytestream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 功能:
 * 作者:
 * 日期:2024/05/14 22:00
 */
public class ByteStreamDemo10 {
    public static void main(String[] args) throws FileNotFoundException {

        FileInputStream fis = new FileInputStream("D:\\Documents\\bbb\\a.txt");
        FileOutputStream fos = new FileOutputStream("myio\\a2.txt");
        try (fis; fos){

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
