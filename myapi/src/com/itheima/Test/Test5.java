package com.itheima.Test;

/**
 * 功能:
 * 作者:
 * 日期:2024/04/25 18:27
 */
public class Test5 {
    public static void main(String[] args) {
        
    }
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0){
            return "";
        }
        String prefix = strs[0];
        int count = strs.length;
        for(int i = 1; i < count; i++){
            prefix = longestCommonPrefix(prefix, strs[i]);
            if(prefix.length() == 0){
                break;
            }
        }
        return prefix;
    }

    private String longestCommonPrefix(String str1, String str2) {
        int length = Math.min(str1.length(), str2.length());
        int index = 0;
        while(index < length && str1.charAt(index) == str2.charAt(index)){
            index ++;
        }
        return str1.substring(0, index); // close left and open right
    }
}
