package com.solvd.airport.mainclasses.planes;

import com.solvd.airport.enums.SeatLetter;
import com.solvd.airport.enums.Type;

public class Seat {
    private int row;
    private Enum<SeatLetter> letter;
    private Type type;

    public Seat(int row, Enum<SeatLetter> letter, Type type) {
        this.row = row;
        this.type = type;
    }

    public int getRow() {
        return this.row;
    }

    public Enum<SeatLetter> getLetter() {
        return letter;
    }

    public String toString() {
        return "Characteristics" +
                "Row:" + getRow() +
                "Letter: " + getLetter();
    }

    public Enum<Type> getType(Type type) {
        return this.type;
    }

}
