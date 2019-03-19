package cn.bcs.game;

import java.awt.*;

public class DefaultImage {
    TextImage plane = new TextImage();

    public DefaultImage() {
        plane.setColor(Color.white);
        plane.setFont(new Font("STHupo", Font.PLAIN, 16));
        plane.setName("plane");
    }
}
