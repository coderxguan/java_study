package com.itheima.myobjectstream;

import java.io.*;

/**
 * 功能:
 * 作者:
 * 日期:2024/05/16 15:23
 */
public class ObjectStreamDemo2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("myio\\a.txt"));

        Student o = (Student)ois.readObject();

        System.out.println(o);

        ois.close();

    }
}
