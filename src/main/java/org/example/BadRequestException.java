package org.example;

public class BadRequestException extends RuntimeException {
    public BadRequestException() {
        super("Invalid Input size, you must 3 input length");
    }
}
