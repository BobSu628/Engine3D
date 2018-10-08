package util;

public class Vector {
    private double x, y, z;

    public Vector(double x, double y, double z){
        this.x = x; this.y = y; this.z = z;
    }

    public Vector add(Vector v){
        return new Vector(this.x+v.getX(), this.y+v.getY(), this.z+v.getZ());
    }

    public Vector subtract(Vector v){
        return new Vector(this.x-v.getX(), this.y-v.getY(), this.z-v.getZ());
    }

    public Vector rotateXY(double degree){
        double radian = degree / 180 * Math.PI;
        double x = Math.cos(radian) * this.x - Math.sin(radian) * this.y,
               y = Math.sin(radian) * this.x + Math.cos(radian) * this.y,
               z = this.z;

        return new Vector(x, y, z);

    }

    public Vector rotateXZ(double degree){
        double radian = degree / 180 * Math.PI;
        double x = Math.cos(radian) * this.x + Math.sin(radian) * this.z,
                y = this.y,
                z = -Math.sin(radian) * this.x + Math.cos(radian) * this.z;

        return new Vector(x, y, z);

    }

    public Vector rotateYZ(double degree){
        double radian = degree / 180 * Math.PI;
        double x = this.x,
                y = Math.cos(radian) * this.y - Math.sin(radian) * this.z,
                z = Math.sin(radian) * this.y + Math.cos(radian) * this.z;

        return new Vector(x, y, z);

    }

    public Vector scale(double x, double y, double z){
        return new Vector(x*this.x, y*this.y, z*this.z);
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }
}
