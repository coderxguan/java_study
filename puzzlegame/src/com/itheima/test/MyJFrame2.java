package com.itheima.test;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * 功能:
 * 作者:
 * 日期:2024/04/21 19:00
 */
public class MyJFrame2 extends JFrame implements MouseListener {

    JButton jtb1 = new JButton("touch me");
    public MyJFrame2(){
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
        jtb1.addMouseListener(this);




        // add button to the ui
        this.getContentPane().add(jtb1);




        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("clicked");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("pressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("released");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("entered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("exited");
    }
}
