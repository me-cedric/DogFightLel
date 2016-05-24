package jpu2016.dogfight.model;

/**
 * Created by me-ce on 23/05/2016.
 */
public class Dimension {
    int width;
    int height;

    public Dimension(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Dimension(Dimension dimension)
    {

    }

    public int getWidth()
    {
        return width;
    }

    public void setWidth(int width)
    {
        this.width = width;
    }

    public int getHeight()
    {
        return height;
    }

    public void setHeight(int height)
    {
        this.height = height;
    }
}
