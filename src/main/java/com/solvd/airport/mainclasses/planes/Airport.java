package com.solvd.airport.mainclasses.planes;

import java.time.LocalTime;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.solvd.airport.Main;
import com.solvd.airport.utils.Logger;

@SuppressWarnings("hiding")
public class Airport<Airline> {
	private static Logger LOGGER = Logger.getLogger(Main.class);
	private String codeName;
    private String name;
    private Address address;
    private int code;
    private List<Flight> flights;
    private Collection<Airline> airlines;

    public Airport(String codeName,String name, int code) {
        this.codeName = codeName;
    	this.name = name;
        this.code = code;
    }

    public String getCodeName() {
		return codeName;
	}

	public void setCodeName(String codeName) {
		this.codeName = codeName;
	}

	public List<Flight> getFlights() {
		return flights;
	}

	public void setFlights(List<Flight> flights) {
		this.flights = flights;
	}

	public String getName() {
        return this.name;
    }

    public int getCode() {
        return this.code;
    }

    public void setName(String name) {
		this.name = name;
	}
    
    public List<Flight> getFlight() {
        return flights;
    }

    public void setFlight(List<Flight> flights) {
        this.flights = flights;
    }

    public Collection<Airline> getAirlines() {
        return airlines;
    }

    public void setAirlines(Collection<Airline> airlist) {
        this.airlines = airlist;
    }

	public void setAddress(Address address) {
		this.address = address;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public Address getAddress() {
        return this.address;
    }
	
	
	
	public void receivePlane(Flight flight) {
        if (LocalTime.now() == flight.getDepartureTime()) {
            LOGGER.info(flight.getIDFlight() + "has arrived at " + getName() + code + "airport");
            Map<Integer, Integer> incomingFlights = new HashMap<Integer, Integer>();
            for (int i = 0; i < incomingFlights.size(); i++) {
                incomingFlights.put(i, flight.getIDFlight());
            }
        }
    }

    public void sendPlane(Flight flight) {
        if (LocalTime.now() == flight.getDepartureTime()) {
            LOGGER.debug(flight.getIDFlight() + "has departed from " + getName() + code + "airport");
            Map<Integer, Integer> outgoingFlights = new HashMap<Integer, Integer>();
            for (int i = 0; i < outgoingFlights.size(); i++) {
                outgoingFlights.remove(i, flight.getIDFlight());
            }
        }
    }
}
