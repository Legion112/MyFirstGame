package ru.fearofcode;

import javax.swing.*;

/**
 * Created by maks on 30.04.2017.
 */
public class StartGame {
    public static GameFrame gameFrame;
    public static GamePanel gamePanel;
    public static void main(String[] args) {
        gamePanel = new GamePanel();
        gameFrame = new GameFrame("Shooter 2D", gamePanel);

        System.out.println("exit main");
    }
}
