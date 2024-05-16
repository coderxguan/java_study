package com.itheima.myobjectstream;

import java.io.*;

/**
 * 功能:
 * 作者:
 * 日期:2024/05/16 15:17
 */
public class ObjectStreamDemo1 {
    public static void main(String[] args) throws IOException {

        Student stu = new Student("zhangsan", 23);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("myio\\a.txt"));

        oos.writeObject(stu);
        oos.close();
    }
}
