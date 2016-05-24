package jpu2016.dogfight.model;

import java.util.ArrayList;

/**
 * Created by me-ce on 23/05/2016.
 */
public interface IDogfightModel {

    IArea getArea();

    void buildArea(jpu2016.dogfight.model.Dimension Dimension);

    void addMobile(IMobile Mobile);

    void removeMobile(IMobile Mobile);

    ArrayList<IMobile> getMobiles();

    IMobile getMobileByPlayer(int Player);

    void setMobilesHavesMoved();
}
