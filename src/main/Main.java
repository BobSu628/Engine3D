package main;

import javax.swing.*;

public class Main {

    public static void main(String args[]){
        JFrame f = new JFrame("Engine3D");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Window w = new Window();

        f.add(w);
        f.addKeyListener(w);
        f.setSize(Window.WIDTH, Window.HEIGHT);
        f.setVisible(true);
    }
}
