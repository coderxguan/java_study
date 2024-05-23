package com.itheima.test2;

import com.sun.source.tree.Scope;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

/**
 * 功能:
 * 作者:
 * 日期:2024/05/23 15:03
 */
public class Client {
    public static void main(String[] args) throws IOException {


        Socket socket = new Socket("127.0.0.1", 10000);
        String str = "见到你很高兴";
        OutputStream os = socket.getOutputStream();
        os.write(str.getBytes());
        // 写出一个结束标记
        socket.shutdownOutput();



        InputStream is = socket.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);
        int b ;
        while((b = isr.read())!= -1){
            System.out.print((char)b);
        }


        socket.close();
    }
}
