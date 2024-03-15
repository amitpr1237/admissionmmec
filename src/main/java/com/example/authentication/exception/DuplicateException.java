package com.example.authentication.exception;

public class DuplicateException extends RuntimeException{

    public DuplicateException(String message){
        super(message);
    }

    public DuplicateException(){
        super();
    }
}
