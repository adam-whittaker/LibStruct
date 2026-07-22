package com.mason.libstruct.interfaces;

import com.mason.libstruct.geo.Coord;

public interface Boundable{

    boolean withinBounds(Coord c);

}
