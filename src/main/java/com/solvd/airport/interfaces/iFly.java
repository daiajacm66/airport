package com.solvd.airport.interfaces;

import com.solvd.airport.mainclasses.planes.Airline;
import com.solvd.airport.mainclasses.planes.Airport;
import com.solvd.airport.mainclasses.planes.Flight;

public interface iFly {
    void flyFrom(Airport<Airline<Flight>> id);

    void flyTo(Airport<Airline<Flight>> id);

    void fly();
}
