package com.lib_for_mentor.lib_for_mentor.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class PublisherNotFoundException extends RuntimeException {
    public PublisherNotFoundException(String message) {
        super(message);
    }
}
