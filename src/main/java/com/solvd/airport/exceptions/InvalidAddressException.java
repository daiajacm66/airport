package com.solvd.airport.exceptions;

public class InvalidAddressException extends Exception {
    public InvalidAddressException(String message) {
        super("Sorry, the address is invalid! Try again.");
    }

    public InvalidAddressException(String message, Throwable cause) {
        super(message, cause);
    }
}
