package com.solvd.airport.mainclasses.planes;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.core.Logger;
import org.apache.logging.log4j.util.*;
import java.util.stream.Collectors;

import com.solvd.airport.Main;
import com.solvd.airport.exceptions.InvalidTariffException;
import com.solvd.airport.interfaces.iFly;
import com.solvd.airport.interfaces.iTransferFlight;
import com.solvd.airport.mainclasses.planes.Airport;
import com.solvd.airport.mainclasses.planes.Plane;
import com.solvd.airport.mainclasses.users.Passenger;
import com.solvd.airport.interfaces.iPlaneState;

public class Flight implements iFly, iTransferFlight, iPlaneState {
    private static Logger LOGGER = Logger.getLogger(Main.class);
    private int idFlight;
    private Plane<Seat> plane;
    private Airport<Airline<Flight>> originAirport;
    private Airport<Airline<Flight>> destinationAirport;
    private LocalTime departureTime;
    private LocalTime arrivalTime;
    private List<Passenger> passengers;
    private ArrayList<Flight> flights;
    private LocalDate date;
    private Double price;

    public Flight(Plane<Seat> plane, Airport<Airline<Flight>> originAirport,
            Airport<Airline<Flight>> destinationAirport, LocalDate date, LocalTime departureTime,
            LocalTime arrivalTime) {
        this.plane = plane;
        this.originAirport = originAirport;
        this.destinationAirport = destinationAirport;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.date = date;
    }

    public int getIDFlight() {
        return this.idFlight;
    }

    public void setIDFlight() {
        this.idFlight = 0;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalTime departureTime) {
        this.departureTime = departureTime;
    }

    public LocalTime getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(LocalTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String toString() {
        return this.plane + " (" + this.originAirport + "-" + this.destinationAirport + ")";
    }

    public void checkIn(Passenger passenger) {
        passenger.setCheckedInFlight(true);
        System.out.println("Successfully Checked In Flight");
    }

    public Plane<Seat> getPlane() {
        return plane;
    }

    public void setPlane(Plane<Seat> plane) {
        this.plane = plane;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        if (price < 0) {
            throw new InvalidTariffException("The price has to be positive");
        } else {
            this.price = price;
        }
    }

    public Airport<Airline<Flight>> getOriginAirport() {
        return originAirport;
    }

    public void setOriginAirport(Airport<Airline<Flight>> originAirport) {
        this.originAirport = originAirport;
    }

    public Airport<Airline<Flight>> getDestinationAirport() {
        return destinationAirport;
    }

    public void setDestinationAirport(Airport<Airline<Flight>> destinationAirport) {
        this.destinationAirport = destinationAirport;
    }

    public void setIdFlight(int idFlight) {
        this.idFlight = idFlight;
    }

    public void changeFlight(Airport<Airline<Flight>> airport) {
        LOGGER.info(idFlight + "has a transfer at" + airport.getCode());
    }

    public void changeFlight() {
        LOGGER.info(idFlight + "has no transfers.");
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(List<Passenger> passengers) {
        this.passengers = passengers;
    }

    public void onTime() {
        System.out.println("The plane is on time.");
    }

    public void boarding() {
        System.out.println("Passengers, this is the pre-boarding for flight " + getIDFlight()
                + ". Please have your boarding pass and identification ready. Thank you.");
    }

    public void delayed() {
        System.out.println("The plane is delayed.");
    }

    public void cancelled() {
        System.out.println("The flight has been cancelled.");
    }

    public void fly() {

    }

    public void flyFrom(Airport<Airline<Flight>> airport) {
        LOGGER.info("Flight " + idFlight + "departs from" + airport.getCode());
    }

    public void flyTo(Airport<Airline<Flight>> airport) {
        LOGGER.info("Flight " + idFlight + "arrives in" + airport.getCode());
    }

    /*
     * public Double calculatePrice() {
     * Double price = getPrice();
     * if (Passenger.getAge() < 2) {
     * price = 0.0d;
     * return price;
     * } else if (Passenger.getAge() > 65) {
     * price = price * 0.10d;
     * return price;
     * } else {
     * LOGGER.info("There is no discount available for your passenger status.");
     * }
     * return price;
     * }
     */

}
