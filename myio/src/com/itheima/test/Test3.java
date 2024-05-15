package com.itheima.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringJoiner;
import java.util.function.Function;

/**
 * 功能:
 * 作者:
 * 日期:2024/05/15 20:41
 */
public class Test3 {
    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("myio\\a.txt");

        StringBuilder sb = new StringBuilder();

        int ch;
        while ((ch = fr.read()) != -1) {
            sb.append((char) ch);
        }
        fr.close();
        System.out.println(sb);

//        String str = sb.toString();
//
//        String[] arrStr = str.split("-");
//
//        ArrayList<Integer> list = new ArrayList<>();
//
//        for (String s : arrStr) {
//            int i = Integer.parseInt(s);
//            list.add(i);
//        }
//
//        System.out.println(list);
//
//        list.sort((o1, o2) -> o1 - o2);
//
//        System.out.println(list);
//
//
//        StringJoiner sj = new StringJoiner("-");
//        for (Integer integer : list) {
//            sj.add(integer.toString());
//        }
//
//        System.out.println(sj);
//
//        FileWriter fw  = new FileWriter("myio\\a.txt");
//
//        fw.write(sj.toString());
//        fw.close();

        Integer[] arr = Arrays.stream(sb.toString()
                        .split("-"))
                .map(Integer::parseInt)
                .sorted((o1, o2) -> o2 - o1)
                .toArray(Integer[]::new);


        FileWriter fw  = new FileWriter("myio\\a.txt");
        String s = Arrays.toString(arr).replace(",", "-");
        String result = s.substring(1, s.length() - 1);

        fw.write(result);
        fw.close();




    }
}
