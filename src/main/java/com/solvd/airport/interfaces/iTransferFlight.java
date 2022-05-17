package com.solvd.airport.interfaces;

import com.solvd.airport.mainclasses.planes.Airline;
import com.solvd.airport.mainclasses.planes.Airport;
import com.solvd.airport.mainclasses.planes.Flight;

public interface iTransferFlight {
    void changeFlight(Airport<Airline<Flight>> id1);

    void changeFlight();
}
