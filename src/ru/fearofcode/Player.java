package ru.fearofcode;

import java.awt.Color;
import java.awt.Graphics2D;

/**
 * Created by maks on 24.04.2017.
 */
class Player {


    private double speed;
    private double spdV;
    private double spdH;
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

        speed = 10;
        spdV = 0;
        spdH = 0;
    }

    public void update(){


        if(Listener.keyUp ){
            y -= speed;
        }
        if (Listener.keyDown) {
            y += speed;
        }
        if (Listener.keyLeft) {
            x += speed;
        }
        if (Listener.keyRight) {
            x -= speed;
        }
    }

    public void draw(Graphics2D graphics2D){
        graphics2D.setColor(color);
        graphics2D.fillOval((int)x - r,(int)y - r,d,d);
    }

}
