package com.itheima.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 * 功能:
 * 作者:
 * 日期:2024/05/16 15:47
 */
public class Test6 {
    public static void main(String[] args) throws IOException {

        Student s1 = new Student("zhangsan", 23, "nanjing");
        Student s2 = new Student("zhangsan", 23, "nanjing");
        Student s3 = new Student("zhangsan", 23, "nanjing");

        ArrayList<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("myio\\a.txt"));
        oos.writeObject(list);

        oos.close();

    }
}
