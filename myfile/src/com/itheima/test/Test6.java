package com.itheima.test;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

/**
 * 功能:
 * 作者:
 * 日期:2024/05/13 21:17
 */
public class Test6 {
    public static void main(String[] args) {

        File file = new File("D:\\Documents");
        System.out.println(getCount(file));

    }

    public static HashMap<String, Integer> getCount(File src){
        File[] files = src.listFiles();
        HashMap<String, Integer> hm = new HashMap<>();
        for (File file : files) {
            if(file.isFile()){
                String [] arr = file.getName().split("\\.");
                if(arr.length >=2){
                    String endName = arr[arr.length - 1];
                    if(hm.containsKey(endName)){
                        int count   = hm.get(endName);
                        count++;
                        hm.put(endName, count);
                    }else{
                        hm.put(endName, 1);
                    }
                }
            }else{
                HashMap<String, Integer> sonMap = getCount(file);
                for (Map.Entry<String, Integer> entrys : sonMap.entrySet()) {
                    String key = entrys.getKey();
                    int value = entrys.getValue();

                    if(hm.containsKey(key)){
                        int count = hm.get(key);
                        count += value;
                        hm.put(key, count);
                    }else {
                        hm.put(key, value);
                    }
                }
            }
        }

        return hm;
    }
}
