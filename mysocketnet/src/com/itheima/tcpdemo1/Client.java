package com.itheima.tcpdemo1;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * 功能:
 * 作者:
 * 日期:2024/05/23 14:35
 */
public class Client {
    public static void main(String[] args) throws IOException {
        // 创建socket对象
        Socket socket = new Socket("127.0.0.1", 10000);

        // 从连接通道中获取输出流
        OutputStream os = socket.getOutputStream();

        os.write("你好你好".getBytes());

        os.close();
        socket.close();
    }
}