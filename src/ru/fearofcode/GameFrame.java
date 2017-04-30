package ru.fearofcode;

import javax.swing.*;

/**
 * Created by maks on 30.04.2017.
 */
public class GameFrame extends JFrame {
    public GameFrame(String gameName, GamePanel gamePanel){
        super(gameName);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setContentPane(gamePanel);
        addKeyListener(new Listener());

        pack();
        setVisible(true);


        gamePanel.start();
    }

}
