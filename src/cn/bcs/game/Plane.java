package cn.bcs.game;

import java.awt.*;

public class Plane extends GameObject {
    public Plane(String img, int x, int y) {
        setImg(img);
        setX(x);
        setY(y);
        color = Color.white;
        font = new Font("STHupo", Font.PLAIN, 16);

    }

    @Override
    public void drawSelf(Graphics graphics) {
        graphics.setFont(font);
        graphics.setColor(color);
        graphics.drawString(getImg(), getX(), getY());
        setX(getX() + 1);
    }
}
