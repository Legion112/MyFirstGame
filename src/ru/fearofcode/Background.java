package ru.fearofcode;

import java.awt.Graphics2D;
import java.awt.Color;
/**
 * This class draws the background for the game.
 * Created by maks on 23.04.2017.
 */
public class Background {
    private Color color;

    public Background(){
        color = Color.BLUE;
    }

    public void draw(Graphics2D graphics2D){
        graphics2D.setColor(color);
        graphics2D.fillRect(0,0,GamePanel.WIDTH, GamePanel.HEIGHT);
    }
}
