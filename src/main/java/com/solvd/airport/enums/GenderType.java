package com.solvd.airport.enums;

public enum GenderType {
    Male("M"), Female("F");

    private String gender;

    private GenderType(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return this.gender;
    }
    
}