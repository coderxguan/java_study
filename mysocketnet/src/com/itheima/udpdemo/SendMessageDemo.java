package com.itheima.udpdemo;

import java.io.IOException;
import java.net.*;

/**
 * 功能:
 * 作者:
 * 日期:2024/05/22 20:48
 */
public class SendMessageDemo {
    public static void main(String[] args) throws IOException {

        DatagramSocket ds = new DatagramSocket(10087);


        String str = "hello. hello";
        byte[] bytes = str.getBytes();


        InetAddress address = InetAddress.getByName("127.0.0.1");
        int port   = 10086;

        DatagramPacket dp = new DatagramPacket(bytes, bytes.length, address, port);


        ds.send(dp);


        ds.close();


    }
}
