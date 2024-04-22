package com.itheima.test;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * 功能:
 * 作者:
 * 日期:2024/04/21 19:08
 */
public class MyJFrame3  extends JFrame implements KeyListener {
    JButton jtb1 = new JButton("touch me");
    public MyJFrame3(){
        // set ui width height
        this.setSize(603, 680);
        // show title
        this.setTitle("puzzle-game v1.0");
        // show top
        this.setAlwaysOnTop(true);
        // set middle
        this.setLocationRelativeTo(null);
        // set shutdown
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // cancel default at middle
        this.setLayout(null);

        jtb1.setBounds(0, 0, 100, 50);
        // add mouse-listener to button
        jtb1.addKeyListener(this);




        // add button to the ui
        this.getContentPane().add(jtb1);




        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("pressed");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("released");
        int code = e.getKeyCode();
        System.out.println(code);
    }
}
