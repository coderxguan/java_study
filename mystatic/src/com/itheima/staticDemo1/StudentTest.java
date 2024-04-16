package com.itheima.staticDemo1;

/**
 * 功能:
 * 作者:
 * 日期:2024/04/14 20:34
 */
public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("zhangsan");
        s1.setAge(23);
        s1.setGender("male");
        Student.teacherName = "teacher wei";


        s1.study();
        s1.show();

        Student s2 = new Student();
        s2.setName("lisi");
        s2.setAge(23);
        s2.setGender("female");

        s2.study();
        s2.show();
    }
}
