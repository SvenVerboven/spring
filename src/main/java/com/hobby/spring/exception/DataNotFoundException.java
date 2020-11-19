package com.hobby.spring.exception;

public class DataNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 4599394749224809069L;

    public DataNotFoundException(){
        super("Data not found");
    }
}
