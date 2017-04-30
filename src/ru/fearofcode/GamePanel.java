package ru.fearofcode;

import javax.swing.JPanel;

import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.awt.Graphics2D;
import java.awt.Graphics;
import java.awt.RenderingHints;
/**
 * This class is responsible for drawing the window.
 * In the class has method update and draw.
 * Method update is responsible for update data the game.
 * For example change of the object's coordinates, create and remove objects.
 * Created by maks on 23.04.2017.
 */
public class GamePanel extends JPanel implements Runnable{
    static int HEIGHT = 500;
    static int WIDTH = 500;
    static int speadRoom = 60;
    final static long STEPTIME = 1_000 / speadRoom;

    Thread threadGame;

    BufferedImage image;
    Graphics2D graphics2D;

    Background background;

    Player player;


    public GamePanel(){
        setPreferredSize(new Dimension(HEIGHT,WIDTH));

        // The Class  is what we draw.
        image = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
        graphics2D = (Graphics2D) image.getGraphics();
        graphics2D.setRenderingHints(new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON));

        background = new Background();
        player = new Player();

        addKeyListener(new Listener());
    }
    public void start(){
        threadGame = new Thread(this, "game");
        threadGame.start();
    }

    @Override
    public void run(){
        /*
         This cycle do speed the game.
         */
        while(true) {
            long beginTime = System.currentTimeMillis();
            update();
            render();
            draw();
            long endTime = System.currentTimeMillis();
            long sleepTime = STEPTIME - (endTime - beginTime);
            sleepTime = (sleepTime > 0) ? sleepTime : 0;
            try {
                Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void update(){

    }

    private void render(){
        background.draw(graphics2D);
        player.draw(graphics2D);
    }

    private void draw(){
        Graphics graphics = getGraphics();
        graphics.drawImage(image,0,0,null);
        graphics.dispose();
    }
}
