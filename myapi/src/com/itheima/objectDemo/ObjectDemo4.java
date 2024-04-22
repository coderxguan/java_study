package com.itheima.objectDemo;

import com.google.gson.Gson;

/**
 * 功能:
 * 作者:
 * 日期:2024/04/22 20:12
 */
public class ObjectDemo4 {
    public static void main(String[] args) throws CloneNotSupportedException {

        int [] data = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        User u1 = new User(1, "zhangsan", "1234qwer", "girl1", data);

        User u2 = (User)u1.clone();

        int [] arr = u1.getData();
        arr[0] = 100;




//        System.out.println(u1);
//        System.out.println(u2);

        Gson gson = new Gson();
        //"把对象变成字符串"
        String s = gson.toJson(u1);
        System.out.println(s);

        User user = gson.fromJson(s, User.class);
        System.out.println(user);

    }
}
