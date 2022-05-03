package com.solvd.airport.enums;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum SeatLetter {
    A("A"), B("B"), C("C"), D("D"), E("E"), F("F");

    private String name;

    private SeatLetter(String name) {
        this.name = name;
    }

    public String getLetter() {
        return name;
    }

    public static final List<SeatLetter> LETTERS = Collections.unmodifiableList(Arrays.asList(values()));
}
