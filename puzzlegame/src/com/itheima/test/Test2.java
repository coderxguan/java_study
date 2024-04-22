package com.itheima.test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 功能:
 * 作者:
 * 日期:2024/04/19 22:46
 */
public class Test2 {
    public static void main(String[] args) {
        // set ui width height
        JFrame jFrame = new JFrame();
        jFrame.setSize(603, 680);
        // show title
        jFrame.setTitle("puzzle-game v1.0");
        // show top
        jFrame.setAlwaysOnTop(true);
        // set middle
        jFrame.setLocationRelativeTo(null);
        // set shutdown
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // cancel default at middle
        jFrame.setLayout(null);


        JButton jtb = new JButton("touch me");
        jtb.setBounds(0, 0, 100, 50);
        // mouse left , whitespace
        jtb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("touch me ");
            }
        });

        jFrame.getContentPane().add(jtb);




        jFrame.setVisible(true);
    }
}
