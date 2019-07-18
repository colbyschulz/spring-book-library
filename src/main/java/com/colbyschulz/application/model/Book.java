package com.colbyschulz.application.model;

import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;


public class Book {
    @Size(min=2)
    @NotNull
    private String title;

    @Size(min=2)
    @NotNull
    private String authorFirstName;

    @Size(min=2)
    @NotNull
    private String authorLastName;

    public Book(String title, String authorFirstName, String authorLastName) {
        this.title = title;
        this.authorFirstName = authorFirstName;
        this.authorLastName = authorLastName;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthorFirstName() {
        return authorFirstName;
    }

    public String getAuthorLastName() {
        return authorLastName;
    }
}