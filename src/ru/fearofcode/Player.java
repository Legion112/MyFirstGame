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
    private int d;

    private Color color;

    public Player(){
        x = 0;
        y = 0;
        r = 20;
        d = r * 2;
        color = Color.green;
    }

    public void draw(Graphics2D graphics2D){
        graphics2D.setColor(color);
        graphics2D.fillOval((int)x - r,(int)y - r,d,d);
    }

}
