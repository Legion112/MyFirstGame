package ru.fearofcode;

import javax.swing.*;

/**
 * Created by maks on 30.04.2017.
 */
public class StartGame {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        GamePanel gamePanel = new GamePanel();
        GameFrame gameFrame = new GameFrame("Shooter 2D", gamePanel);
        System.out.println("exit main");
    }
}
