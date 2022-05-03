package com.solvd.airport.mainclasses.planes;

import java.util.List;
import com.solvd.airport.Main;
import com.solvd.airport.enums.AirlineNames;
import com.solvd.airport.utils.Logger;

@SuppressWarnings("hiding")
public class Airline<Flight> {
	private static Logger LOGGER = Logger.getLogger(Main.class);
    private String aid;
    private String aname1;
    private List<Flight> flights;
    private String names;
        
    public Airline(String aname1, String aid) {
        this.aname1 = aname1;
        this.aid = aid;
    }
    
    public String getName() {
        return this.aname1;
    }

    public void setName(AirlineNames name) {
        this.aname1 = names;
    }

    public String getID() {
        return this.aid;
    }

    public void setId(String id) {
        this.aid = id;
    }
    
    public List<Flight> getFlights() {
        return flights;
    }

    public void setFlights(List<Flight> flights) {
        this.flights = flights;
    }
    
    /*public void displayFlights(List<Flight> flights) {
        List<Flight> flightsListed = flights.stream()
                .filter(flight -> getOriginAirport() == "Minsk")
                .filter(flight -> getOriginAirport() != null)
                .collect(Collectors.toList());
        LOGGER.debug(flightsListed);
    }*/

}
