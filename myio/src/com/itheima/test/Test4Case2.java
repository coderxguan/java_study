package com.itheima.test;

import java.io.*;
import java.util.*;

/**
 * 功能:
 * 作者:
 * 日期:2024/05/16 14:08
 */
public class Test4Case2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("myio\\csb.txt"));
        String line;
        TreeMap<Integer, String> tm = new TreeMap<>();
        while((line = br.readLine()) != null){
            String[] arr = line.split("\\.");
            tm.put(Integer.parseInt(arr[0]), arr[1]);
        }
        br.close();


        BufferedWriter bw = new BufferedWriter(new FileWriter("myio\\result2.txt"));
        for (Map.Entry<Integer, String> entry : tm.entrySet()) {
            String value = entry.getValue();
            bw.write(value);
            bw.newLine();
        }

        bw.close();




    }
}
