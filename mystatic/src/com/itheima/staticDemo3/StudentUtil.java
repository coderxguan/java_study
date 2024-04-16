package com.itheima.staticDemo3;

import java.util.ArrayList;

/**
 * 功能:
 * 作者:
 * 日期:2024/04/14 21:13
 */
public class StudentUtil {
    private StudentUtil(){}

    public static int getMaxAgeStudent(ArrayList<Student> list){
        int max = list.get(0).getAge();

        for (Student student : list) {
            if(student.getAge() > max){
                max = student.getAge();
            }
        }
        return max;
    }
}
