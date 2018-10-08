package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import util.Object3D;
import util.Point;
import util.Vector;

public class Window extends JPanel implements KeyListener{

    static final int WIDTH = 500, HEIGHT = 400, DEPTH = 500;

    private Point[] pointArray = new Point[100];
    private Random r = new Random();
    private int count = 0;

    public Window(){
        for(int i = 1; i <= pointArray.length; i ++){
            pointArray[i-1] = new Point(r.nextInt(WIDTH), r.nextInt(HEIGHT), r.nextInt(DEPTH));
            count = i;
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground(Color.BLACK);

        /*Point p = new Point(200, 100, 300);
        p.drawPoint(g);
        */
        for(int i = 0; i < count; i ++){
            pointArray[i].drawPoint(g);
        }
    }

    public void redrawScreen(){
        this.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();
        if(key == KeyEvent.VK_D){
            redrawScreen();
        }else if(key == KeyEvent.VK_A){
            scale(0.5);
        }else if(key == KeyEvent.VK_S){
            scale(2.0);
        }else if(key == KeyEvent.VK_R){
            rotate();
        }else if(key == KeyEvent.VK_ESCAPE){
            System.exit(1);
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    private void scale(double factor){
        Point origin = Point.ORIGIN;
        Vector tempVector;

        for(int i = 0; i < pointArray.length; i ++){
            tempVector = pointArray[i].subtractPoint(origin);
            pointArray[i].setPoint(origin);
            pointArray[i].addVector(tempVector.scale(factor, factor, factor));
        }
        redrawScreen();
    }

    private void rotate(){
        Point origin = Point.ORIGIN;
        Vector tempVector;

        for(int i = 0; i < pointArray.length; i ++){
            tempVector = pointArray[i].subtractPoint(origin);
            pointArray[i].setPoint(origin);
            pointArray[i].addVector(tempVector.rotateXY(15));
        }
        redrawScreen();
    }

}
