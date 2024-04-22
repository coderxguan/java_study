package com.itheima.test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

/**
 * 功能:
 * 作者:
 * 日期:2024/04/21 18:48
 */
public class MyJFrame extends JFrame implements ActionListener {
    JButton jtb1 = new JButton("touch me");
    JButton jtb2 = new JButton("touch again");


    public MyJFrame(){
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
        // add action
        jtb1.addActionListener(this);



        jtb2.setBounds(100, 0, 100, 50);
        jtb2.addActionListener(this);


        // add button to the ui
        this.getContentPane().add(jtb1);
        this.getContentPane().add(jtb2);




        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // get the button object operating
        Object source = e.getSource();

        if(source == jtb1){
            jtb1.setSize(200, 200);

        }else if(source == jtb2){
            Random r = new Random();
            jtb2.setLocation(r.nextInt(500), r.nextInt(500));
        }
    }
}
