package cn.bcs.game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GameFrame extends JFrame {

    DefaultImage img = new DefaultImage();
    public void paint(Graphics g) {
        g.setColor(img.plane.getColor());
        g.setFont(img.plane.getFont());
        g.drawString(img.plane.getImg(), 250,250);
    }

    public void lunchFrame() {
//        this.setBackground(Color.black);
        this.setTitle("PlanWar");
        this.setVisible(true);
        this.setSize(500,500);
        this.setLocation(300,300);

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }

    public static void main(String[] args) {
        GameFrame gameFrame = new GameFrame();
        gameFrame.lunchFrame();
    }

}
