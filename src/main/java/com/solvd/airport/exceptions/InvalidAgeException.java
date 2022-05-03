package com.solvd.airport.exceptions;

public class InvalidAgeException extends RuntimeException {
    public InvalidAgeException(String message) {
        super("Enter a value greater than 0.");
    }

}
