package com.solvd.airport.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.solvd.airport.mainclasses.planes.Address;
import com.solvd.airport.mainclasses.users.Charge;

public class SCollections {

    public static void main(String[] args) {

        Charge chargeone = new Charge(001, "Pilot", "Person in charge off fly the plane.");
        Charge chargetwo = new Charge(002, "CoPilot", "Second hand of the pilot");
        Charge chargethree = new Charge(003, "Asisstant", "Personal of assistant to passangers");
        Charge chargefour = new Charge(004, "Security", "Personal who take care for safe of passengers on plane");

        Set<Charge> listCharges = new HashSet<Charge>();
        listCharges.add(chargeone);
        listCharges.add(chargetwo);
        listCharges.add(chargethree);
        listCharges.add(chargefour);

        List<Address> addresses = new ArrayList<Address>();
        addresses.add(new Address("Netherlands", "Amsterdam"));
        addresses.add(new Address("Russia", "Moscow"));
        addresses.add(new Address("Poland", "Warshaw"));
        addresses.add(new Address("France", "Paris"));
        addresses.add(new Address("United Kingdom", "London"));
        addresses.add(new Address("Germany", "Berlin"));
        addresses.add(new Address("Italy", "Rome"));
        addresses.add(new Address("Spain", "Madrid"));
        addresses.add(new Address("Turkey", "Istanbul"));
        addresses.add(new Address("Argentina", "Buenos Aires"));

        // Employee pilot1 = new Employee(01, chargeone, null, null, 0, null, null,
        // null, null, 0);
        // Employee pilot2 = new Employee(02, chargeone, null, null, 0, null, null,
        // null, null, 0);
        // Employee pilot3 = new Employee(03, chargeone, null, null, 0, null, null,
        // null, null, 0);
        // Employee asistant = new Employee(04, chargethree, null, null, 0, null, null,
        // null, null, 0);

    }
}