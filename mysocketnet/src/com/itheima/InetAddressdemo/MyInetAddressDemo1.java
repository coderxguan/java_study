package com.itheima.InetAddressdemo;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * 功能:
 * 作者:
 * 日期:2024/05/22 20:36
 */
public class MyInetAddressDemo1 {
    public static void main(String[] args) throws UnknownHostException {
        // IP 对象, 电脑的对象
        InetAddress address = InetAddress.getByName("LAPTOP-ARUMMK2C");

        System.out.println(address);


        String hostAddress = address.getHostAddress();
        System.out.println(hostAddress);

        System.out.println(address.getHostName());
    }
}
