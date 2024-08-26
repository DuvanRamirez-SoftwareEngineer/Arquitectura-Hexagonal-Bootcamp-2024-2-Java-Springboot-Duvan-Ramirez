package com.emazon.emazonarquitecturahexagonal.adapters.driven.jpa.mysql.exception;

public class ProductAlreadyExistsException extends RuntimeException {
    public ProductAlreadyExistsException(String message) {
        super(message);
    }
}
