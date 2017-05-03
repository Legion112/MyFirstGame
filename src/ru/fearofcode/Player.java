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
    public static double sin45 = Math.sin(Math.toRadians(45));
    public static double cos45 = Math.cos(Math.toRadians(45));
    private double x;
    private double y;
    private int r;
    private int d;

    private Color color;

    public Player(){

        x = 250;
        y = 250;
        r = 20;
        d = r * 2;
        color = Color.green;

        speed = 5;
        spdV = 0;
        spdH = 0;
    }

    public void update(){


        if (Listener.keyUp) {
            spdV = -speed;
        }
        if (Listener.keyDown){
            spdV = speed;
        }
        if (Listener.keyLeft) {
            spdH = speed;
        }
        if (Listener.keyRight) {
            spdH = -speed;
        }
        if(Listener.keyUp && Listener.keyLeft) {
            spdH = speed * cos45;
            spdV = -(speed * sin45);
        }
        if (Listener.keyUp && Listener.keyRight) {
            spdH = -(speed * cos45);
            spdV = -(speed * sin45);
        }
        if (Listener.keyDown && Listener.keyLeft) {
            spdH = (speed * cos45);
            spdV = (speed * sin45);
        }
        if (Listener.keyDown && Listener.keyRight) {
            spdH = -(speed * cos45);
            spdV = (speed * sin45);
        }

        y += spdV;
        x += spdH;
        spdH = 0;
        spdV = 0;

    }

    public void draw(Graphics2D graphics2D){
        graphics2D.setColor(color);
        graphics2D.fillOval((int)x - r,(int)y - r,d,d);
    }

}
