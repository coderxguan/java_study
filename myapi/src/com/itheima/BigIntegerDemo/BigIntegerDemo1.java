package com.itheima.BigIntegerDemo;

import java.math.BigInteger;
import java.util.Random;

/**
 * 功能:
 * 作者:
 * 日期:2024/04/22 20:56
 */
public class BigIntegerDemo1 {
    public static void main(String[] args) {


        BigInteger bd1 = new BigInteger(4, new Random());
        System.out.println(bd1);

        BigInteger bd2 = new BigInteger("-1");
        System.out.println(bd2);

        BigInteger bd3 = new BigInteger("100", 16);
        System.out.println(bd3);

        BigInteger bd4 = BigInteger.valueOf(100);
        System.out.println(bd4);
    }
}
