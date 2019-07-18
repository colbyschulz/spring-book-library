package com.colbyschulz.application.controller;

import org.springframework.http.ResponseEntity;

import java.net.URI;

public class ResponseUtility {

    public static ResponseEntity buildOkResponse(Object entity) {

        return ResponseEntity.ok().body(entity);
    }

    public static ResponseEntity buildCreatedResponse(Integer id) {

        URI location = URI.create("http:localhost:8080/users/" + id);

        return ResponseEntity.created(location).build();
    }
}