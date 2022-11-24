package Tictactoe;

import javax.swing.*;
import java.awt.*;

public class GUI {
    JFrame jf;
    Draw draw;
    JButton []btn = new JButton[9];
    public GUI(){
        jf = new JFrame();
        jf.setSize(800,600);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jf.setLocationRelativeTo(null);
        jf.setTitle("Tictactoe");
        jf.setResizable(false);
        for (int i = 0; i < btn.length; i++) {
            btn[i] = new JButton();
            btn[i].setBorder(null);
            btn[i].setContentAreaFilled(false);
            btn[i].setVisible(true);
            btn[i].addActionListener(new Actionhandler());
            btn[i].setFocusPainted(false);
            btn[i].setContentAreaFilled(false);
            jf.add(btn[i]);
        }
        draw = new Draw();
        draw.setBounds(0,0,800,600);
        jf.add(draw);
        draw.setVisible(true);
        jf.setVisible(true);
    }
}
