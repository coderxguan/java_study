package com.itheima.test1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;

/**
 * 功能:
 * 作者:
 * 日期:2024/07/08 16:57
 */
public class Test1 {
    public static void main(String[] args) throws IllegalAccessException, IOException {


        Student s = new Student("littleA", 23, '女', 167.5, "sleep");
        Teacher t = new Teacher("boNiu", 10000);


        saveObject(s);
    }


    public static void saveObject(Object obj) throws IllegalAccessException, IOException {
        Class clazz = obj.getClass();

        BufferedWriter bw = new BufferedWriter(new FileWriter("myreflect\\a.txt"));

        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);

            String name = field.getName();

            Object value = field.get(obj);

            bw.write(name + "=" + value);
            bw.newLine();
        }

        bw.close();
    }
}
