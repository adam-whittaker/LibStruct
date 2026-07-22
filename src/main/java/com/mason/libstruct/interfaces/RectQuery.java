package com.mason.libstruct.interfaces;

import com.mason.libstruct.geo.Coord;
import com.mason.libstruct.geo.Size;

public interface RectQuery extends Boundable, CoordQuery{

    Size getSize();


    default int width(){
        return getSize().width();
    }

    default int height(){
        return getSize().height();
    }

    @Override
    default boolean withinBounds(Coord c){
        return c.x() >= x() && c.y() >= y() && c.x() < x()+width() && c.y() < y()+height();
    }

}
