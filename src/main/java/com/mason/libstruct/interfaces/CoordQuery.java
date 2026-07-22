package com.mason.libstruct.interfaces;

import com.mason.libstruct.geo.Coord;

public interface CoordQuery{

    Coord getCoord();


    default int x(){
        return getCoord().x();
    }

    default int y(){
        return getCoord().y();
    }

}
