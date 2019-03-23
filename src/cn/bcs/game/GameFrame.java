package cn.bcs.game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GameFrame extends JFrame {

    Plane plane = new Plane("Plane", 250, 250);
    public void paint(Graphics g) {
        plane.drawSelf(g);
    }

    class PaintThread extends Thread {
        @Override
        public void run() {
            while (true) {
                repaint();
                try {
                    Thread.sleep(40);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    public void lunchFrame() {
        this.setBackground(Color.white);
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

        new PaintThread().start();

    }

    public static void main(String[] args) {
        GameFrame gameFrame = new GameFrame();
        gameFrame.lunchFrame();
    }

}
