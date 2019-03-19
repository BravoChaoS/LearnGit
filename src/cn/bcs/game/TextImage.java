package cn.bcs.game;

import java.awt.*;

public class TextImage {
    private String name;
    private String img;
    private Color color;
    private Font font;

    public TextImage() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        if (getImg() == null) {
            setImg(name);
        }
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Font getFont() {
        return font;
    }

    public void setFont(Font font) {
        this.font = font;
    }
}
