package cn.bcs.game;

import java.awt.*;

public class GameObject {
    private String img;
    private int x, y;
    private int weight, height;
    private int speed;
    Color color;
    Font font;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public GameObject() {
    }

    public GameObject(String img, int x, int y) {

        this.img = img;
        this.x = x;
        this.y = y;
    }

    public GameObject(String img, int x, int y, int weight, int height, int speed) {
        this.img = img;
        this.x = x;
        this.y = y;
        this.weight = weight;
        this.height = height;
        this.speed = speed;
    }

    public void drawSelf(Graphics graphics) {
        graphics.drawString(img, x, y);
    }

    public String getImg() {

        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
