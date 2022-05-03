package com.solvd.airport.interfaces;

import com.solvd.airport.mainclasses.planes.Airport;

public interface iFly {
    void flyFrom(Airport id);

    void flyTo(Airport id);

    void fly();
}
