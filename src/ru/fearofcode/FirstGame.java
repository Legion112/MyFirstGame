package ru.fearofcode;

import javax.swing.JFrame;


/**
 * Created by maks on 23.04.2017.
 */
public class FirstGame {

    /**
     * Point is input of the program.
     * Here start the program window.
     * @param args - it is an array of arguments to the Command Line.
     */
    public static void main(String[] args){
        JFrame frame = new JFrame(); // This an instance class to JFrame is the program window.
        GamePanel gamePanel = new GamePanel();//

        frame.setContentPane(gamePanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        gamePanel.start();
    }
}
