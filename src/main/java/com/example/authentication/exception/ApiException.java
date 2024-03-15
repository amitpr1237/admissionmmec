package com.example.authentication.exception;

public class ApiException extends RuntimeException{

    public ApiException(String message){
        super(message);
    }

    public ApiException(){
        super("Invalid Username or Password !!");
    }
}
