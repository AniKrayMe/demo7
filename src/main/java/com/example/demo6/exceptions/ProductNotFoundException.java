package com.example.demo6.exceptions;

public class ProductNotFoundException extends RuntimeException{
    public ProductNotFoundException(String message) {
        super("BRUH");
    }
}
