package com.itheima.regexDemo;

/**
 * 功能:
 * 作者:
 * 日期:2024/04/23 21:43
 */
public class RegexDemo2 {
    public static void main(String[] args) {
        // valid phone number 13409948842
        String regex1 = "1[3-9]\\d{9}";
        String phoneNumber = "13284483382";

        System.out.println(phoneNumber.matches(regex1));


        String regex2 = "0\\d{2,3}-?\\d{5,7}";

        String phone1 = "020-2324532";
        String phone2 = "02099889";
        String phone3 = "0713-2324532";
        System.out.println(phone1.matches(regex2));
        System.out.println(phone2.matches(regex2));
        System.out.println(phone3.matches(regex2));


        String regex3 = "\\w+@[\\w&&[^_]]{2,6}(\\.[a-zA-z]{2,3}){1,2}";

        String email = "3244122234@163.com.edu";

        System.out.println(email.matches(regex3));

        String regex4 = "([01]\\d|2[0-3]):[0-5]\\d:[0-5]\\d";

    }
}
