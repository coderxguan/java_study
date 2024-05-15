package com.itheima.mycharset;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * 功能:
 * 作者:
 * 日期:2024/05/15 18:47
 */
public class CharSetDemo2 {
    public static void main(String[] args) throws UnsupportedEncodingException {

        String str = "ai你";
        byte[] bytes1 = str.getBytes();
        System.out.println(Arrays.toString(bytes1));


        byte[] bytes2 = str.getBytes("gbk");
        System.out.println(Arrays.toString(bytes2));

        String str3 = new String(bytes1, "gbk");
        System.out.println(str3);

    }
}
