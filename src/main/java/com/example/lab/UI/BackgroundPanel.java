package com.example.lab.UI;

import javax.swing.*;
import java.awt.*;

public class BackgroundPanel extends JPanel {
    private static final long seriaVersionUID=-6352788025440244338L;
    private String imagestr;
    private Image image;

    protected  void paintComponent(Graphics g){
        g.drawImage(image,0,0,this.getWidth(),this.getHeight(),this);
    }

    public void setImagestr(String imagestr) {
        this.imagestr = imagestr;
        image=(Image) new ImageIcon(imagestr).getImage();
    }
}
