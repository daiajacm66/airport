package com.solvd.airport;

import com.solvd.airport.utils.Logger;
import com.solvd.airport.enums.Type;
import com.solvd.airport.exceptions.InvalidAgeException;
import com.solvd.airport.exceptions.InvalidNameException;
import com.solvd.airport.exceptions.InvalidDNIException;
import com.solvd.airport.mainclasses.users.Passenger;
import com.solvd.airport.mainclasses.users.Charge;
import com.solvd.airport.mainclasses.users.Employee;
import com.solvd.airport.mainclasses.planes.*;
import com.solvd.airport.enums.AirlineNames;
import com.solvd.airport.enums.GenderType;
import com.solvd.airport.enums.SeatLetter;
import com.solvd.airport.collections.SCollections;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Main {
	private static Logger LOGGER = Logger.getLogger(Main.class);
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) throws InvalidAgeException, InvalidDNIException, InvalidNameException {
    	LOGGER.debug("Hola");
    	
    	SCollections colec = new SCollections();
    	Passenger passenger1 = new Passenger("Makula", "Daiana", 41110722, "3644335144", "daianamakula@gmail.com", 12547, "41110722", (GenderType.Female), null, 0);
    	Passenger passenger2 = new Passenger("Makula", "Zulma", 22487888, "3644335144", "zulmamakula@gmail.com", 13869, "22487888", (GenderType.Female), null, 0);
    	Passenger passenger3 = new Passenger("Landeka", "Anabela", 40617863, "3644587921", "analandeka@gmail.com", 12498, "40617863", GenderType.Female, null, 0);
    	Passenger passenger4 = new Passenger("Antognoni", "Julieta", 0, null, null, 0, null, null, null, 0);
    	Passenger passenger5 = new Passenger("Castelli", "Hector", 0, null, null, 0, null, null, null, 0);
    	
    	List<Passenger> pass1 = new ArrayList<Passenger>();
    	pass1.add(passenger1);
    	pass1.add(passenger2);
    	pass1.add(passenger3);
    	pass1.add(passenger4);
    	pass1.add(passenger5);
    	
    	try {
            passenger1.setAge(23);
            passenger2.setAge(48);
            passenger3.setAge(24);
            passenger4.setAge(28);
            passenger5.setAge(56);
        } catch (InvalidAgeException e) {
            LOGGER.debug("The age has to be positive");
        }
    	
    	LOGGER.info("Enter the name of the passenger");
        Scanner scPassengerName = new Scanner(System.in);
        passenger1.setName(scPassengerName.next());

        LOGGER.info("Hello " + passenger1.getName());
        
        Seat s1 = new Seat(1, SeatLetter.A, null);
        Seat s2 = new Seat(1, SeatLetter.B, null);
        Seat s3 = new Seat(1, SeatLetter.C, null);
        Seat s4 = new Seat(5, SeatLetter.B, null);
        Seat s5 = new Seat(5, SeatLetter.D, null);
        Seat s6 = new Seat(2, SeatLetter.B, null);
        Seat s7 = new Seat(2, SeatLetter.D, null);
        Seat s8 = new Seat(2, SeatLetter.B, null);
        Seat s9 = new Seat(2, SeatLetter.C, null);
        Seat s10 = new Seat(3, SeatLetter.A, null);
        Seat s11 = new Seat(3, SeatLetter.B, null);
        Seat s12 = new Seat(4, SeatLetter.D, null);
        Seat s13 = new Seat(4, SeatLetter.B, null);
        Seat s14 = new Seat(4, SeatLetter.A, null);

        s1.getType(Type.ECONOMY);
        s2.getType(Type.BUSINESS);
        s3.getType(Type.PREMIUM_ECONOMY);
        s4.getType(Type.ECONOMY);
        s5.getType(Type.FIRST_CLASS);
        s6.getType(Type.ECONOMY);
        s7.getType(Type.BUSINESS);
        s8.getType(Type.FIRST_CLASS);
        s9.getType(Type.ECONOMY);
        s10.getType(Type.PREMIUM_ECONOMY);
        s11.getType(Type.PREMIUM_ECONOMY);
        s12.getType(Type.ECONOMY);
        s13.getType(Type.ECONOMY);
        s14.getType(Type.ECONOMY);
        
        

        List<Seat> seats1 = new ArrayList<Seat>();
        seats1.add(s1);
        seats1.add(s2);
        seats1.add(s3);
        List<Seat> seats2 = new ArrayList<Seat>();
        seats1.add(s4);
        seats1.add(s5);
        seats1.add(s6);
        List<Seat> seats3 = new ArrayList<Seat>();
        seats1.add(s7);
        seats1.add(s8);
        seats1.add(s9);
        seats1.add(s10);
        List<Seat> seats4 = new ArrayList<Seat>();
        seats1.add(s11);
        seats1.add(s12);
        seats1.add(s13);
        seats1.add(s14);
        
        List<Plane<Seat>> planes = new ArrayList<Plane<Seat>>();
        planes.add(new Plane<Seat>("Boeing737", 340, AirlineNames.AAR, seats1));
        planes.add(new Plane<Seat>("Airbus 330", 340, AirlineNames.ANT, seats4));
        planes.add(new Plane<Seat>("Airbus 330", 340, AirlineNames.AMA,seats2));
        planes.add(new Plane<Seat>("Boeing747", 150, AirlineNames.EUA,seats3));
        planes.add(new Plane<Seat>("Airbus 321", 340, AirlineNames.IBE, seats3));
        planes.add(new Plane<Seat>("Boeing747", 150, AirlineNames.IBE, seats1));
        planes.add(new Plane<Seat>("Airbus 321", 340, AirlineNames.AAR, seats1));
        planes.add(new Plane<Seat>("Airbus 320", 340, AirlineNames.SKY, seats1));
        planes.add(new Plane<Seat>("Boeing747", 150, AirlineNames.UKA, seats1));
        planes.add(new Plane<Seat>("Airbus 320", 340, AirlineNames.AAR, seats1));
        planes.add(new Plane<Seat>("Boeing777-200", 340, AirlineNames.AMA, seats1));
        planes.add(new Plane<Seat>("Boeing777-200", 250, AirlineNames.ANT, seats1));
        planes.add(new Plane<Seat>("Boeing777-200", 250, AirlineNames.EUA, seats1));
        planes.add(new Plane<Seat>("Boeing777-200", 250, AirlineNames.IBE, seats1));
        planes.add(new Plane<Seat>("Boeing747", 150, AirlineNames.AAR, seats1));
        planes.add(new Plane<Seat>("Boeing737", 340, AirlineNames.SKY, seats1));
        planes.add(new Plane<Seat>("Boeing737", 340, AirlineNames.UKA, seats1));
        planes.add(new Plane<Seat>("Boeing737", 340, AirlineNames.EUA, seats1));
        planes.add(new Plane<Seat>("Boeing737", 340, AirlineNames.AAR, seats1));
        
        Airline<Flight> airline1 = new Airline<Flight>("032", "Amsterdam Airlines");
        Airline<Flight> airline7 = new Airline<Flight>("0245","Aerolineas Argentinas");
        Airline<Flight> airline2 = new Airline<Flight>("0373","American Airlines");
        Airline<Flight> airline3 = new Airline<Flight>("015","Iberia");
        Airline<Flight> airline4 = new Airline<Flight>("293","Sky Airlines");
        Airline<Flight> airline5 = new Airline<Flight>("0375","United Airlines");
        Airline<Flight> airline6 = new Airline<Flight>("396","British Airways");
        Collection<Airline<Flight>> airlinelist = new ArrayList<Airline<Flight>>();
        airlinelist.add(airline1);
        airlinelist.add(airline2);
        airlinelist.add(airline3);
        airlinelist.add(airline4);
        airlinelist.add(airline5);
        airlinelist.add(airline6);
        airlinelist.add(airline7);
        
        Airport<Airline<Flight>> airport1 = new Airport<Airline<Flight>>("MSQ", "Minsk", 01);
        Airport<Airline<Flight>> airport2 = new Airport<Airline<Flight>>("SVO", "Sheremetevo", 02);
        Airport<Airline<Flight>> airport3 = new Airport<Airline<Flight>>("DME", "Domodedovo", 03);
        Airport<Airline<Flight>> airport4 = new Airport<Airline<Flight>>("AYT", "Antalia", 04);
        Airport<Airline<Flight>> airport5 = new Airport<Airline<Flight>>("ICT", "Istanbul", 05);
        Airport<Airline<Flight>> airport6 = new Airport<Airline<Flight>>("BCN", "Barcelona", 06);
        Airport<Airline<Flight>> airport7 = new Airport<Airline<Flight>>("DXB", "Dubai", 07);
        Airport<Airline<Flight>> airport8 = new Airport<Airline<Flight>>("FCO", "Rome", 10);
        Airport<Airline<Flight>> airport9 = new Airport<Airline<Flight>>("EZE", "BUENOSARIES", 11);
        Airport<Airline<Flight>> airport10 = new Airport<Airline<Flight>>("MIN", ".MINSK", 12);
        Airport<Airline<Flight>> airport11 = new Airport<Airline<Flight>>("MAD", "MADRID", 13);
        Airport<Airline<Flight>> airport12 = new Airport<Airline<Flight>>("PRA", "BARCELONA", 14);
        Airport<Airline<Flight>> airport13 = new Airport<Airline<Flight>>("LAX", "LOSANGELES", 15);
        Airport<Airline<Flight>> airport14 = new Airport<Airline<Flight>>("HEA", "LONDON", 16);
        Airport<Airline<Flight>> airport15 = new Airport<Airline<Flight>>("GAT", "LONDON", 17);
        Airport<Airline<Flight>> airport16 = new Airport<Airline<Flight>>("BRA", "BRASIL", 18);
        
        /*try {
            airport1.setCodeName("MSQ");
            airport2.setCodeName("SVO");
            airport3.setCodeName("DME");
            airport4.setCodeName("AYT");
            airport5.setCodeName("ICT");
            airport6.setCodeName("BCN");
            airport7.setCodeName("DXB");
            airport8.setCodeName("FCO");
            airport9.setCodeName("EZE");
            airport10.setCodeName("MIN");
            airport11.setCodeName("MAS");
            airport12.setCodeName("PRA");
            airport13.setCodeName("LAX");
            airport14.setCodeName("HEA");
            airport15.setCodeName("GAT");
            airport16.setCodeName("BRA");
        } catch (InvalidNameException e) {
            LOGGER.info("The id should only contain capital letters");}
        */
        airport1.setAirlines(airlinelist);
        airport2.setAirlines(airlinelist);
        airport3.setAirlines(airlinelist);
        airport4.setAirlines(airlinelist);
        airport5.setAirlines(airlinelist);
        airport6.setAirlines(airlinelist);
        airport7.setAirlines(airlinelist);
        airport8.setAirlines(airlinelist);
        
        Collection<Airport<Airline<Flight>>> airportl = new ArrayList<Airport<Airline<Flight>>>();
        airportl.add(airport1);
        airportl.add(airport2);
        airportl.add(airport3);
        airportl.add(airport4);
        airportl.add(airport5);
        airportl.add(airport6);
        airportl.add(airport7);
        airportl.add(airport8);
        airportl.add(airport9);
        airportl.add(airport10);
        airportl.add(airport11);
        airportl.add(airport12);
        airportl.add(airport13);
        airportl.add(airport14);
        airportl.add(airport15);
        airportl.add(airport16);
        
        Flight flight1 = new Flight(planes.get(0), airport16, airport11, LocalDate.of(2021, 10, 15), LocalTime.of(10, 25), LocalTime.of(16, 25));
        Flight flight2 = new Flight(planes.get(3), airport2, airport15, LocalDate.of(2021, 12, 10), LocalTime.of(15, 45), LocalTime.of(20, 00));
        Flight flight3 = new Flight(planes.get(1), airport11, airport7, LocalDate.of(2021, 10, 15), LocalTime.of(17, 10), LocalTime.of(23, 15));        
        Flight flight4 = new Flight(planes.get(2), airport3, airport9, LocalDate.of(2021, 10, 15), LocalTime.of(10, 50), LocalTime.of(17, 20));
        Flight flight5 = new Flight(planes.get(4), airport14, airport11, LocalDate.of(2021, 10, 15), LocalTime.of(19, 30), LocalTime.of(2, 50));
        Flight flight6 = new Flight(planes.get(4), airport4, airport12, LocalDate.of(2021, 10, 15), LocalTime.of(23, 10), LocalTime.of(3, 10));
        Flight flight7 = new Flight(planes.get(4), airport6, airport5, LocalDate.of(2021, 10, 15), LocalTime.of(17, 25), LocalTime.of(21, 45));
        
        List<Flight> flightslist = new ArrayList();
        HashSet<Flight> bflight1 = new HashSet<Flight>();
        bflight1.add(flight1);
        bflight1.add(flight3);
        
        flightslist.add(flight1);
        flightslist.add(flight2);
        flightslist.add(flight3);
        flightslist.add(flight4);
        flightslist.add(flight5);
        flightslist.add(flight6);
        flightslist.add(flight7);
        
        Type takeseat1 = Type.takeSeat("economy");
        Type takeseat2 = Type.takeSeat("premiun-economy");
        Type takeseat3 = Type.takeSeat("business");
        Type takeseat4 = Type.takeSeat("first class");
        
        try {
            switch (takeseat1) {
                case ECONOMY:
                    flight1.setPrice(100.0d);
                    flight2.setPrice(120.0d);
                    flight3.setPrice(250.0d);
                    flight4.setPrice(300.0d);
                    flight5.setPrice(350.0d);
                    flight6.setPrice(150.0d);
                    flight7.setPrice(350.0d);
                    break;
                case PREMIUM_ECONOMY:
                    flight1.setPrice(200.0d);
                    flight2.setPrice(180.0d);
                    flight3.setPrice(350.0d);
                    flight4.setPrice(500.0d);
                    flight5.setPrice(600.0d);
                    flight6.setPrice(300.0d);
                    flight7.setPrice(550.0d);
                    break;
                case BUSINESS:
                    flight1.setPrice(900.0d);
                    flight2.setPrice(1000.0d);
                    flight3.setPrice(1200.0d);
                    flight4.setPrice(1000.0d);
                    flight5.setPrice(1100.0d);
                    flight6.setPrice(1300.0d);
                    flight7.setPrice(1550.0d);
                    break;
                case FIRST_CLASS:
                    flight1.setPrice(1900.0d);
                    flight2.setPrice(2000.0d);
                    flight3.setPrice(2200.0d);
                    flight4.setPrice(2000.0d);
                    flight5.setPrice(2100.0d);
                    flight6.setPrice(2300.0d);
                    flight7.setPrice(2550.0d);
                    break;
            }
            switch (Type.BUSINESS) {
                case ECONOMY:
                    flight1.setPrice(100.0d);
                    flight2.setPrice(120.0d);
                    flight3.setPrice(250.0d);
                    flight4.setPrice(300.0d);
                    flight5.setPrice(350.0d);
                    flight6.setPrice(150.0d);
                    flight7.setPrice(350.0d);
                    break;
                case PREMIUM_ECONOMY:
                    flight1.setPrice(200.0d);
                    flight2.setPrice(180.0d);
                    flight3.setPrice(350.0d);
                    flight4.setPrice(500.0d);
                    flight5.setPrice(600.0d);
                    flight6.setPrice(300.0d);
                    flight7.setPrice(550.0d);
                    break;
                case BUSINESS:
                    flight1.setPrice(900.0d);
                    flight2.setPrice(1000.0d);
                    flight3.setPrice(1200.0d);
                    flight4.setPrice(1000.0d);
                    flight5.setPrice(1100.0d);
                    flight6.setPrice(1300.0d);
                    flight7.setPrice(1550.0d);
                    break;
                case FIRST_CLASS:
                    flight1.setPrice(1900.0d);
                    flight2.setPrice(2000.0d);
                    flight3.setPrice(2200.0d);
                    flight4.setPrice(2000.0d);
                    flight5.setPrice(2100.0d);
                    flight6.setPrice(2300.0d);
                    flight7.setPrice(2550.0d);
                    break;
            }
            switch (Type.PREMIUM_ECONOMY) {
                case ECONOMY:
                    flight1.setPrice(100.0d);
                    flight2.setPrice(120.0d);
                    flight3.setPrice(250.0d);
                    flight4.setPrice(300.0d);
                    flight5.setPrice(350.0d);
                    flight6.setPrice(150.0d);
                    flight7.setPrice(350.0d);
                    break;
                case PREMIUM_ECONOMY:
                    flight1.setPrice(200.0d);
                    flight2.setPrice(180.0d);
                    flight3.setPrice(350.0d);
                    flight4.setPrice(500.0d);
                    flight5.setPrice(600.0d);
                    flight6.setPrice(300.0d);
                    flight7.setPrice(550.0d);
                    break;
                case BUSINESS:
                    flight1.setPrice(900.0d);
                    flight2.setPrice(1000.0d);
                    flight3.setPrice(1200.0d);
                    flight4.setPrice(1000.0d);
                    flight5.setPrice(1100.0d);
                    flight6.setPrice(1300.0d);
                    flight7.setPrice(1550.0d);
                    break;
                case FIRST_CLASS:
                    flight1.setPrice(1900.0d);
                    flight2.setPrice(2000.0d);
                    flight3.setPrice(2200.0d);
                    flight4.setPrice(2000.0d);
                    flight5.setPrice(2100.0d);
                    flight6.setPrice(2300.0d);
                    flight7.setPrice(2550.0d);
                    break;
            }
            switch (Type.FIRST_CLASS) {
                case ECONOMY:
                    flight1.setPrice(100.0d);
                    flight2.setPrice(120.0d);
                    flight3.setPrice(250.0d);
                    flight4.setPrice(300.0d);
                    flight5.setPrice(350.0d);
                    flight6.setPrice(150.0d);
                    flight7.setPrice(350.0d);
                    break;
                case PREMIUM_ECONOMY:
                    flight1.setPrice(200.0d);
                    flight2.setPrice(180.0d);
                    flight3.setPrice(350.0d);
                    flight4.setPrice(500.0d);
                    flight5.setPrice(600.0d);
                    flight6.setPrice(300.0d);
                    flight7.setPrice(550.0d);
                    break;
                case BUSINESS:
                    flight1.setPrice(900.0d);
                    flight2.setPrice(1000.0d);
                    flight3.setPrice(1200.0d);
                    flight4.setPrice(1000.0d);
                    flight5.setPrice(1100.0d);
                    flight6.setPrice(1300.0d);
                    flight7.setPrice(1550.0d);
                    break;
                case FIRST_CLASS:
                    flight1.setPrice(1900.0d);
                    flight2.setPrice(2000.0d);
                    flight3.setPrice(2200.0d);
                    flight4.setPrice(2000.0d);
                    flight5.setPrice(2100.0d);
                    flight6.setPrice(2300.0d);
                    flight7.setPrice(2550.0d);
                    break;
                default:
                    break;
            }
        } catch (InvalidTariffException e) {
            LOGGER.debug("The price has to be positive");
        }
             
        flight1.fly();
        flight2.fly();
        flight3.fly();
        flight4.fly();
        flight5.fly();
        flight6.fly();
        flight7.fly();
        
        System.out.println("WELCOME TO AIRPORT SOLVD!!"
				+ "This program is a simulation of an airport"
				+ "\t You can only see the flights are avairables, dates and individual costs."
				+ "Options: 1. Exit. 2. List of flights. 3. List of planes. 4. List of Airport");
		int option = sc.nextInt();
		do {
			switch (option) {
				case 0:
					LOGGER.info("Exiting");
					break;
				case 1:
					System.out.println("List of flights avairables: ");
					for(int i = 0; i < flightslist.size(); i++) {
						System.out.println("\t" + flightslist.get(i));
					}
					break;
				case 2:
					System.out.println("List of planes ");
					for(int i = 0; i < planes.size(); i++) {
						System.out.println("\t" + planes.get(i));
					}
					break;
				case 3:
					System.out.println("List of Airports avairables: ");
					for(int i = 0; i < airportl.size(); i++) {
						System.out.println("\t" + flightslist.get(i));
					}
					break;
				case 4:
					System.out.println("List of Airlines avairables: ");
					for(int i = 0; i < airlinelist.size(); i++) {
						System.out.println("\t" + airlinelist.get(i));
					}
					break;
				default:
					System.out.println("Invalid option! Please, try again.");
					;
			}
		}while (option != 0);
	}
 
}