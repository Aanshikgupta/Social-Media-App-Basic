package com.aanshik.socialmediaapi.ExceptionHandlers;

public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException() {
    }


    public ResourceNotFoundException(String resource, Integer id) {
        super(resource+" with id = "+id +" not found");
    }
}
