package Tictactoe;

import javax.swing.*;
import java.awt.*;

public class Draw extends JLabel {
    private static final long  serialVersionUID= 1L;
    protected void paintComponent(Graphics g){
    super.paintComponent(g);
    Graphics2D g2d =(Graphics2D) g;
    g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

    g.setColor(Color.BLUE);
    g.drawLine(475,50,475,500);
    g.drawLine(310,50,310,500);

    g.drawLine(175,190,625,190);
    g.drawLine(175,350,625,350);
    }
}
