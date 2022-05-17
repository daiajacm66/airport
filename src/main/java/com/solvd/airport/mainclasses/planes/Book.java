package com.solvd.airport.mainclasses.planes;

import com.solvd.airport.mainclasses.users.Passenger;

import java.time.LocalTime;
import java.util.HashSet;
import com.solvd.airport.interfaces.iBook;

public abstract class Book implements iBook {
    private LocalTime takeOff;
    private LocalTime arrive;
    private Airport<Airline<Flight>> orign;
    private Airport<Airline<Flight>> dest;
    private Passenger passCode;
    private long BookNum;
    private Tariff tariff;
    HashSet<Flight> flightList = new HashSet<Flight>();

    public Book(LocalTime takeOff, LocalTime arrive, long BookNum, HashSet<Flight> flightList) {
        this.takeOff = takeOff;
        this.arrive = arrive;
        this.BookNum = BookNum;
        this.flightList = flightList;
    }

    public LocalTime takeOff() {
        return this.takeOff;
    }

    public Passenger getPassenger() {
        return this.passCode;
    }

    public Airport<Airline<Flight>> getOrign() {
        return this.orign;
    }

    public Airport<Airline<Flight>> getDest() {
        return this.dest;
    }

    public LocalTime arrive() {
        return this.arrive;
    }

    public long BookNum() {
        return this.BookNum;
    }

    public void book() {

    }

    public Tariff getTariff() {
        return this.tariff;
    }

    public HashSet<Flight> getFlightList() {
        return flightList;
    }

    public void iCheckIn(Passenger passenger) {
    }

}