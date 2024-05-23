package com.itheima.tcpdemo1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 功能:
 * 作者:
 * 日期:2024/05/23 14:36
 */
public class Server {
    public static void main(String[] args) throws IOException {

        ServerSocket ss = new ServerSocket(10000);


        Socket socket = ss.accept();

//        InputStream is = socket.getInputStream();
//        InputStreamReader isr = new InputStreamReader(is);

        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));


        int b = 0;

        while((b=br.read())!= -1){
            System.out.print((char)b);
        }

        socket.close();
        br.close();
    }
}
