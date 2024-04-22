package com.itheima.ui;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import java.util.Vector;

/**
 * 功能:
 * 作者:
 * 日期:2024/04/18 21:46
 */
public class GameJFrame extends JFrame implements KeyListener, ActionListener {
    // define two-dimensional array to manage data
    // loading image with the array
    int [][] data = new int[4][4];
    // record the position of zero
    int x = 0;
    int y = 0;

    // record picture path
    String path = "image\\animal\\animal3\\";

    int [][] win = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11,12},
            {13, 14, 15, 0},
    };
    // record step
    int step = 0;

    // create sub-item
    JMenuItem replayItem = new JMenuItem("replay game");
    JMenuItem reLonginItem = new JMenuItem("repLogin game");
    JMenuItem closeItem = new JMenuItem("close game");
    JMenuItem accountItem = new JMenuItem("Account");
    JMenuItem girl = new JMenuItem("girl");
    JMenuItem animal = new JMenuItem("animal");
    JMenuItem sport = new JMenuItem("sport");




    // 游戏主界面
    public GameJFrame(){
        // init ui
        initJFrame();

        // init menu
        initJMenuBar();

        // init data(disordered and load image)
        initData();

        // init image
        initImage();


        // show visible
        this.setVisible(true);

    }


    // disorder
    private void initData() {
        // disorder the one dimensional array 0 ~ 15
        // set of four into two-dimensional array


        // define a one dimensional array
        int [] tempArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        // disorder arr
        // for each arr, take an element switch with a random index
        Random r = new Random();
        for(int i = 0; i < tempArr.length; i++){
            // get random index
            int index = r.nextInt(tempArr.length);
            // switch two element
            int temp = tempArr[i];
            tempArr[i] = tempArr[index];
            tempArr[index] = temp;
        }

        // add to two-dimensional array
        for (int i = 0; i < tempArr.length; i++) {
            if(tempArr[i] == 0){
                x = i / 4;
                y = i % 4;

            }
            data[i / 4][i % 4] = tempArr[i];
        }
    }

    // init image
    private void initImage() {
        // remove all
        this.getContentPane().removeAll();

        if(victory()){
            // show the icon of win
            JLabel winJLabel = new JLabel(new ImageIcon("image\\win.png"));
            winJLabel.setBounds(203, 283, 197, 73);
            this.getContentPane().add(winJLabel);
        }

        JLabel stepCount = new JLabel("step: " + step);
        stepCount.setBounds(50, 30, 100, 20);
        this.getContentPane().add(stepCount);

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j ++) {
                // create JLabel vessel
                JLabel jLabel = new JLabel(new ImageIcon
                        (path + data[i][j] +".jpg"));
                // set position
                jLabel .setBounds(105 * j +83, 105*i + 134, 105, 105);
                // add border
                jLabel.setBorder(new BevelBorder(BevelBorder.LOWERED));
                // 0: bulge image
                // 1: concave image


                // add vessel to ui
                this.getContentPane().add(jLabel );
            }

        }

        // add background image
        JLabel background = new JLabel(new ImageIcon("image\\background.png"));
        background.setBounds(40, 40, 508, 560);
        this.getContentPane().add(background);


        // refresh ui
        this.getContentPane().repaint();
    }

    private void initJMenuBar() {
        // create menu object
        JMenuBar jMenuBar = new JMenuBar();

        // create tow item
        JMenu functionJMenu = new JMenu("function");
        JMenu aboutJMenu = new JMenu("about us");

        JMenu changeImage = new JMenu("change image");

        changeImage.add(girl);
        changeImage.add(animal);
        changeImage.add(sport);


        // match the sub-item to each item
        functionJMenu.add(changeImage);
        functionJMenu.add(replayItem);
        functionJMenu.add(reLonginItem);
        functionJMenu.add(closeItem);
        aboutJMenu.add(accountItem);




        // add action to item
        girl.addActionListener(this);
        animal.addActionListener(this);
        sport.addActionListener(this);
        replayItem.addActionListener(this);
        reLonginItem.addActionListener(this);
        closeItem.addActionListener(this);
        accountItem.addActionListener(this);


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

        // add key-listener
        this.addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        if(code == 65){
            this.getContentPane().removeAll();
            // load integrate image
            JLabel all =new JLabel(new ImageIcon( path + "all.jpg"));
            all.setBounds(83, 134, 420, 420);
            this.getContentPane().add(all);

            // load background image
            JLabel background = new JLabel(new ImageIcon("image\\background.png"));
            background.setBounds(40, 40, 508, 560);
            this.getContentPane().add(background);

            // refresh
            this.getContentPane().repaint();
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
        // judge if wined, otherwise return
        if(victory()){
            return;
        }


        // judge up down left right
        int code = e.getExtendedKeyCode();
        if(code == 37){
            System.out.println("move left");
            if(y==3){
                return;
            }
            data[x][y] = data[x][y+1];
            data[x][y+1] = 0;
            y++;

            // move and step increase
            step ++;


            initImage();

        }
        else if(code == 38){
            System.out.println("move up");
            if(x == 3){
                return ;
            }
            data[x][y] = data[x+1][y];
            data[x+1][y] = 0;
            x++;
            // move and step increase
            step ++;

            initImage();
        }
        else if (code == 39){
            System.out.println("move right");
            if(y == 0){
                return;
            }
            data[x][y] = data[x][y-1];
            data[x][y-1] = 0;
            y--;
            // move and step increase
            step ++;

            initImage();

        }
        else if(code == 40){
            System.out.println("move down");
            if(x == 0){
                return;
            }
            data[x][y] = data[x-1][y];
            data[x-1][y] = 0;
            x--;
            // move and step increase
            step ++;

            initImage();
        }
        else if(code == 65){
            initImage();
        }
        else if(code == 87){
            data = new int[][]{
                    {1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {9, 10, 11,12},
                    {13, 14, 15, 0},
            };
            initImage();
        }
    }


    // judge win, weather the data is same as win
    public boolean victory(){
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if(data[i][j] != win[i][j]){
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if(obj == replayItem){
            System.out.println("replay");
            // set step to zero
            step = 0;
            // disorder the data array
            initData();
            // reload image;
            initImage();


        }
        else if(obj == reLonginItem){
            System.out.println("reLongin");
            // shut off present ui
            this.setVisible(false);
            // open login ui
            new LoginJFrame();
        }
        else if(obj == closeItem){
            System.out.println("closed");
            // shut down jvm
            System.exit(0);
        }
        else if(obj == accountItem){
            System.out.println("account");
            JDialog jDialog = new JDialog();
            JLabel jLabel = new JLabel(new ImageIcon("image\\about.png"));
            jLabel.setBounds(0, 0, 258, 258);
            jDialog.getContentPane().add(jLabel);
            jDialog.setSize(344, 344);
            jDialog.setAlwaysOnTop(true);
            jDialog.setLocationRelativeTo(null);
            jDialog.setModal(true);
            jDialog.setVisible(true);

        }
        else if(obj == girl){
            System.out.println("girl");
            Random r = new Random();
            step = 0;
            initData();
            path = "image\\girl\\girl"+(r.nextInt(13)+1) +"\\";
            initImage();
        }
        else if(obj == animal){
            System.out.println("animal");
            Random r = new Random();
            step = 0;
            initData();
            path = "image\\animal\\animal"+(r.nextInt(8)+1) +"\\";
            initImage();
        }
        else if(obj == sport){
            System.out.println("sport");
            Random r = new Random();
            step = 0;
            initData();
            path = "image\\sport\\sport"+(r.nextInt(10)+1) +"\\";
            initImage();
        }
    }
}
