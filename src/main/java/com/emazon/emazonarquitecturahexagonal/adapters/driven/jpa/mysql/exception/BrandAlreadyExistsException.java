package com.emazon.emazonarquitecturahexagonal.adapters.driven.jpa.mysql.exception;

public class BrandAlreadyExistsException extends RuntimeException {
    public BrandAlreadyExistsException(String message) {
        super(message);
    }
}
