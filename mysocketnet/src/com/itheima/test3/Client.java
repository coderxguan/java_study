package com.itheima.test3;

import java.io.*;
import java.net.Socket;

/**
 * 功能:
 * 作者:
 * 日期:2024/05/23 15:20
 */
public class Client {

    public static void main(String[] args) throws IOException {

        Socket socket = new Socket("127.0.0.1", 10000);

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("mysocketnet\\clientdir\\a.jpg"));

        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());

        byte[] bytes = new byte[1024];
        int len;
        while ((len = bis.read(bytes)) != -1){
            bos.write(bytes,0, len);
        }

        // 写出结束标记
        socket.shutdownOutput();


        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String line = br.readLine();
        System.out.println(line);

        socket.close();
        br.close();
    }
}
