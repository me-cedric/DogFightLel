package jpu2016.dogfight.model;

import java.awt.*;

/**
 * Created by me-ce on 23/05/2016.
 */
public interface IMobile {

    public Direction getdirection();

    public void setDirection(Direction direction);

    Point getPosition();

    Dimension getDimension();

    int getWidth();

    int getHeigh();

    int getSpeed();

    Image getImage();

    void move();

    void placeInArea(IArea area);

    boolean isPlayer(int player);

    void setDogfightModel(DogfightModel dogfightModel);

    boolean hit();

    boolean isWeapon();
}
