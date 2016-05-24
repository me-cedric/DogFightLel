package jpu2016.dogfight.model;

import java.awt.*;

/**
 * Created by me-ce on 23/05/2016.
 */
public class Mobile {
    int speed;

    public Mobile(Direction direction, Position position, Dimension dimension, int speed, String image)
    {
        this.speed = speed;
    }

    public Direction getDirection()
    {
        return ;
    }

    public void setDirection()
    {

    }
    public Point getPosition()
    {
        return ;
    }
    public Dimension getDimension()
    {
        return ;
    }
    public int getSpeed()
    {
        return ;
    }
    public int getWidth()
    {
        return ;
    }
    public int getHeight()
    {
        return ;
    }
    public void move()
    {

    }
    public void placeInArea(IArea area)
    {

    }
    public boolean isPlayer(int player)
    {
        return ;
    }
    public void moveUp()
    {

    }
    public void moveRight()
    {

    }

    public void moveDown()
    {

    }

    public void moveLeft()
    {

    }

    public Color getColor()
    {
        return ;
    }

    public IDogfightModel getDogfightModel()
    {
        return ;
    }

    public void setDogfightModel(IDogfightModel dogfightModel)
    {

    }

    public boolean hit()
    {
        return ;
    }

    public boolean isWeapon()
    {
        return ;
    }

    public Image getImage()
    {
        return ;
    }
}
