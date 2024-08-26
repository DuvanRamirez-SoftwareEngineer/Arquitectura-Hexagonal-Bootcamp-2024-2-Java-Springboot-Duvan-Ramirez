package com.emazon.emazonarquitecturahexagonal.adapters.mysql.exception;

public class NoDataFoundException extends RuntimeException {
    public NoDataFoundException(String message) {
        super(message);
    }
}
