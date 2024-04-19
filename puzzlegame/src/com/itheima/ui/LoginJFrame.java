package com.itheima.ui;

import javax.swing.*;

/**
 * 功能:
 * 作者:
 * 日期:2024/04/18 21:47
 */
public class LoginJFrame extends JFrame {
    // login

    public LoginJFrame(){
        // while creating user interface, set some info
        // width, high

        this.setSize(488, 430);
        // show title
        this.setTitle("puzzle-game-login");
        // show top
        this.setAlwaysOnTop(true);
        // set middle
        this.setLocationRelativeTo(null);
        // set shutdown
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // show visible
        this.setVisible(true);
    }
}
