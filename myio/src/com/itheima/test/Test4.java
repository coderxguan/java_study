package com.itheima.test;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

/**
 * 功能:
 * 作者:
 * 日期:2024/05/16 14:08
 */
public class Test4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("myio\\csb.txt"));
        String line;
        ArrayList<String> list = new ArrayList<>();
        while((line = br.readLine()) != null){
            list.add(line);
        }

        br.close();

        Collections.sort(list, (o1, o2)->{
            int i1 = Integer.parseInt(o1.split("\\.")[0]);
            int i2 = Integer.parseInt(o2.split("\\.")[0]);
            return i1- i2;
        });


        BufferedWriter bw = new BufferedWriter(new FileWriter("myio\\result.txt"));
        for (String s : list) {
            bw.write(s);
            bw.newLine();
        }
        bw.close();

    }
}
