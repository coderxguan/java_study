package com.itheima.mygenerics;

import java.util.Arrays;

/**
 * 功能:
 * 作者:
 * 日期:2024/04/27 19:38
 */
public class MyArrayList <E>{
    Object [] obj = new Object[10];
    int size;


    public boolean add(E e){
        obj[size++] = e;
        return true;
    }

    public E get(int index){
        return (E)obj[index];
    }


    public String toString(){
        return Arrays.toString(obj);
    }
}
