package com.itheima.mygenerics;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 功能:
 * 作者:
 * 日期:2024/04/27 19:59
 */
public class ListUtil {
    private ListUtil(){}


    public static <E> void addAll(ArrayList<E> List, E...e){
        List.addAll(Arrays.asList(e));

    }
}
