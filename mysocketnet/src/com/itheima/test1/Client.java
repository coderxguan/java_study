package com.itheima.test1;

import javax.naming.ldap.SortKey;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * 功能:
 * 作者:
 * 日期:2024/05/23 14:56
 */
public class Client {
    public static void main(String[] args) throws IOException {

        Socket socket = new Socket("127.0.0.1", 10000);

        OutputStream os = socket.getOutputStream();
        Scanner sc = new Scanner(System.in);


        while (true) {
            System.out.println("input your message");
            String str = sc.nextLine();
            if("886".equals(str)){
                break;
            }

            os.write(str.getBytes());
        }

        socket.close();


    }
}
