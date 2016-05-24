package jpu2016.dogfight.model;

/**
 * Created by me-ce on 23/05/2016.
 */
public class Position {
    double x, y, maxX, maxY;

    public Position(double x, double y, double maxX, double maxY)
    {
        this.x = x;
        this.y = y;
        this.maxX = maxX;
        this.maxY = maxY;
    }

    public Position(Position position)
    {

    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setMaxX(double maxX) {
        this.maxX = maxX;
    }

    public void setMaxY(double maxY) {
        this.maxY = maxY;
    }
}
