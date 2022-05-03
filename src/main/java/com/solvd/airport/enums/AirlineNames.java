package com.solvd.airport.enums;

public enum AirlineNames {
	ANT("Amsterdam Airlines"), AAR("Aerolineas Argentinas"), AMA("American Airlines"), 
	IBE("Iberia"), SKY("Sky Airlines"), UKA("British Airlines"), EUA("United Airlines");

    private String name;

    AirlineNames(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
