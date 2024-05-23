package com.itheima.test2;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 功能:
 * 作者:
 * 日期:2024/05/23 15:03
 */
public class Server {
    public static void main(String[] args) throws IOException {

        ServerSocket ss = new ServerSocket(10000);

        Socket socket = ss.accept();

        InputStream is  = socket.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);

        int b ;
        // 需要有一个结束标记
        while((b = isr.read())!= -1){
            System.out.print((char)b);
        }

        // 回写数据
        String str = "到底有多开心呢";
        OutputStream os = socket.getOutputStream();
        os.write(str.getBytes());

        socket.close();
        ss.close();
    }
}
