package com.solvd.airport.exceptions;

public class InvalidTariffException extends RuntimeException {
    public InvalidTariffException(String message) {
        super("The value must be greater than 0.");
    }

    public InvalidTariffException(String message, Throwable cause) {
        super(message, cause);
    }
}
