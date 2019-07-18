package com.colbyschulz.application.controller;

import com.colbyschulz.application.exception.EntityNotFoundException;
import com.colbyschulz.application.model.User;
import com.colbyschulz.application.persistence.Persistence;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/users")
public class UserController {

    private Persistence persistence;

    public UserController(Persistence persistence) {
    this.persistence = persistence;
    }

    @PostMapping
    public ResponseEntity addUser(@Valid @RequestBody User user) {
        return ResponseUtility.buildCreatedResponse(persistence.addUser(user));
    }

    @GetMapping
    public ResponseEntity getAllUsers() {
        return ResponseUtility.buildOkResponse(persistence.getAllUsers());
    }

    @GetMapping("/{userId}")
    public ResponseEntity getUserById(@PathVariable Integer userId) throws EntityNotFoundException {
        return ResponseUtility.buildOkResponse(persistence.getUserById(userId));
    }

}