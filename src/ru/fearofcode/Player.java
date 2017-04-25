package ru.fearofcode;

import java.awt.Color;
import java.awt.Graphics2D;

/**
 * Created by maks on 24.04.2017.
 */
public class Player {
    private double x;
    private double y;
    private int r;

    private Color color;

    public Player(){
        x = 200;
        y = 200;
        r = 100;
        color = Color.green;
    }

    public void draw(Graphics2D graphics2D){
        graphics2D.setColor(color);
        graphics2D.fillOval((int)0,(int)0,GamePanel.WIDTH,GamePanel.HEIGHT);
    }

}
