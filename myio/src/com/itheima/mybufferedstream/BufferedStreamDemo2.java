package com.itheima.mybufferedstream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * 功能:
 * 作者:
 * 日期:2024/05/15 21:35
 */
public class BufferedStreamDemo2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("myio\\a.txt"));
//        String line = br.readLine();
//
//        System.out.println(line);

        String line;
        while((line = br.readLine()) != null){
            System.out.println(line);
        }

        br.close();
    }
}
