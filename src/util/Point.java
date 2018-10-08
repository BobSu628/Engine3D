package util;

import java.awt.*;

public class Point extends Component{
    private double x, y, z;

    public static final Point ORIGIN = new Point(0, 0, 0);

    public Point(){ }

    public Point(double x, double y, double z){
        this.x = x; this.y = y; this.z = z;
    }

    public Point addVector(Vector v){
        this.x += v.getX(); this.y += v.getY(); this.z += v.getZ();
        return this;
    }

    public Point subtractVector(Vector v){
        this.x -= v.getX(); this.y -= v.getY(); this.z -= v.getZ();
        return this;
    }

    public Vector subtractPoint(Point p){
        return new Vector(this.x-p.getXComp(), this.y-p.getYComp(), this.z-p.getZComp());
    }

    public void paint(Graphics g){
        this.drawPoint(g);
    }

    public void drawPoint(Graphics g){
        g.setColor(Color.WHITE);
        g.drawLine((int)this.x, (int)this.y, (int)this.x, (int)this.y);

    }

    public void setPoint(Point p){
        this.x = p.getXComp(); this.y = p.getYComp(); this.z = p.getZComp();
    }

    public double getYComp() {
        return y;
    }

    public void setYComp(double y) {
        this.y = y;
    }

    public double getZComp() {
        return z;
    }

    public void setZComp(double z) {
        this.z = z;
    }

    public double getXComp() {
        return x;
    }

    public void setXComp(double x) {
        this.x = x;
    }

    public void setXYZComp(double x, double y, double z){
        this.x = x; this.y = y; this.z = z;
    }
}
