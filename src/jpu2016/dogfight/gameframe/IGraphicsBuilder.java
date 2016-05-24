package jpu2016.dogfight.gameframe;

import java.awt.*;
import java.awt.image.ImageObserver;

/**
 * Created by me-ce on 23/05/2016.
 */
public interface IGraphicsBuilder {
    void applyModelToGraphic(Graphics graphics, ImageObserver observer);
    int getGlobalWidth();
    int getGlobalHeight();
}
