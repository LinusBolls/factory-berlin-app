package com.github.jasminb.jsonapi.exceptions;

public class UnregisteredTypeException extends RuntimeException {
    public UnregisteredTypeException(String str) {
        super("No class was registered for type '" + str + "'.");
    }
}
