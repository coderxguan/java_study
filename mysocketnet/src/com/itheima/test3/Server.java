package com.itheima.test3;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 功能:
 * 作者:
 * 日期:2024/05/23 15:20
 */
public class Server {

    public static void main(String[] args) throws IOException {

        ServerSocket ss = new ServerSocket(10000);

        Socket socket = ss.accept();

        BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("mysocketnet\\serverdir\\a.jpg"));

        int len;
        byte[] bytes = new byte[1024];
        while((len = bis.read(bytes)) != -1){
            bos.write(bytes, 0, len);
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bw.write("上传成功");
        bw.newLine();
        bw.flush();

        socket.close();
        ss.close();

    }
}
