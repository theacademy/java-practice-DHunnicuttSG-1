package org.example.service;

public class ClassRosterDataValidationException extends RuntimeException {
    public ClassRosterDataValidationException(String message) {
        super(message);
    }

    public ClassRosterDataValidationException(String message, Throwable cause) {
        super(message, cause);
    }
}
