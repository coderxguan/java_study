package com.itheima.test1;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 功能:
 * 作者:
 * 日期:2024/05/23 14:57
 */
public class Server {
    public static void main(String[] args) throws IOException {

        ServerSocket ss = new ServerSocket(10000);

        Socket socket = ss.accept();


        InputStreamReader isr = new InputStreamReader(socket.getInputStream());

        int b;
        while((b = isr.read()) != -1){
            System.out.print((char)b);
        }

        socket.close();
        ss.close();
    }
}
