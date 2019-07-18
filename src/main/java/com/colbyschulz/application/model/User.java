package com.colbyschulz.application.model;

import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY) long id;

    @Size(min=2)
    @NotNull
    private String userFirstName;

    @Size(min=2)
    @NotNull
    private String userLastName;

    public User(String userFirstName, String userLastName) {
        this.userFirstName = userFirstName;
        this.userLastName = userLastName;
    }

    public String getUserFirstName() {
        return userFirstName;
    }

    public String getUserrLastName() {
        return userLastName;
    }
}