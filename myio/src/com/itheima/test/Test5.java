package com.itheima.test;

import java.io.*;

/**
 * 功能:
 * 作者:
 * 日期:2024/05/16 14:27
 */
public class Test5 {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new FileReader("myio\\count.txt"));
        String line = br.readLine();

        int count = Integer.parseInt(line);

        count ++;
        if(count <= 3){
            System.out.println("welcome to use our software,"+ count + " use for free");
        }
        else{
            System.out.println("just three times for free");
        }

        BufferedWriter bw = new BufferedWriter(new FileWriter("myio\\count.txt"));

        bw.write(count + "");

        bw.close();
        br.close();
    }


}
