package ru.fearofcode;


import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.security.Key;

/**
 * This class is listener keyboard and mouse. He catches move mouse, press a button to keyboard.
 * Created by maks on 25.04.2017.
 */
public class Listener implements KeyListener{


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_W){
            System.out.println(KeyEvent.VK_W);
        }
        System.out.println(Thread.currentThread().getStackTrace()[2].getMethodName());
    }


    @Override
    public void keyReleased(KeyEvent e) {

    }
}
