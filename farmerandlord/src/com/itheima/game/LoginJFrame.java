package com.itheima.game;

import com.itheima.domain.User;

import java.util.ArrayList;

/**
 * 功能:
 * 作者:
 * 日期:2024/05/11 10:39
 */
public class LoginJFrame {

    static ArrayList<User> allUser = new ArrayList<>();

    static {
        allUser.add(new User("zhangsan", "123"));
        allUser.add(new User("lisi", "123"));
    }

}
