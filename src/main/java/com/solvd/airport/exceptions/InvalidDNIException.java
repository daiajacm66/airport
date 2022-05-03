package com.solvd.airport.exceptions;

public class InvalidDNIException extends Exception {
    public InvalidDNIException(String message) {
        super("DNI can´t contain caracters or letters. Please, try again.");
    }

}
