package com.itheima.ui;

import javax.swing.*;

/**
 * 功能:
 * 作者:
 * 日期:2024/04/18 21:46
 */
public class GameJFrame extends JFrame {
    // 游戏主界面
    public GameJFrame(){
        // init ui
        initJFrame();

        // init menu
        initJMenuBar();

        // init image
        initImage();


        // show visible
        this.setVisible(true);

    }

    // init image
    private void initImage() {
        int k = 1;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j ++) {
                // create JLabel vessel
                JLabel jLabel = new JLabel(new ImageIcon
                        ("D:\\coding\\Java学习\\basic-code\\" +
                                "puzzlegame\\image\\animal\\animal3\\" + (4 * i + j+1) +".jpg"));
                // set position
                jLabel .setBounds(105 * j, 105*i, 105, 105);
                // add vessel to ui
                this.getContentPane().add(jLabel );
            }

        }




    }

    private void initJMenuBar() {
        // create menu object
        JMenuBar jMenuBar = new JMenuBar();

        // create tow item
        JMenu functionJMenu = new JMenu("function");
        JMenu aboutJMenu = new JMenu("about us");

        // create sub-item
        JMenuItem replayItem = new JMenuItem("replay game");
        JMenuItem reLonginItem = new JMenuItem("repLogin game");
        JMenuItem closeItem = new JMenuItem("close game");

        JMenuItem accountItem = new JMenuItem("Account");

        // match the sub-item to each item
        functionJMenu.add(replayItem);
        functionJMenu.add(reLonginItem);
        functionJMenu.add(closeItem);

        aboutJMenu.add(accountItem);

        // match the two item to main menu
        jMenuBar.add(functionJMenu);
        jMenuBar.add(aboutJMenu);


        // set menu to whole ui
        this.setJMenuBar(jMenuBar);
    }

    private void initJFrame() {
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
    }
}
