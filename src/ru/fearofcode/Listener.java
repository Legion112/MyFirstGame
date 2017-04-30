package ru.fearofcode;


import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.security.Key;

/**
 * This class is listener keyboard and mouse. He catches move mouse, press a button to keyboard.
 * Created by maks on 25.04.2017.
 */
public class Listener implements KeyListener{
    public static boolean keyUp = false;
    public static boolean keyDown = false;
    public static boolean keyLeft = false;
    public static boolean keyRight = false;


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_W){
            keyUp = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_S){
            keyDown = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_D) {
            keyLeft = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_A) {
            keyRight = true;
        }
    }


    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_W){
            keyUp = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_S){
            keyDown = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_D) {
            keyLeft = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_A) {
            keyRight = false;
        }
    }
}
