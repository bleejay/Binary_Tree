package com.sparta.jlb.Control;

public class ChildNotFoundException extends Exception {

    private String message;

    public ChildNotFoundException(String message){
        this.message = message;
    }

    @Override
    public String getMessage(){
        return message;
    }
}
