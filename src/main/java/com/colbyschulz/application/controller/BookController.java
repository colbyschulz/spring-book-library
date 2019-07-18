package com.colbyschulz.application.controller;

import com.colbyschulz.application.model.Book;

import java.util.Map;
import java.util.HashMap;
import java.util.Set;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping ("/books")
public class BookController {
    private Integer id = 1;
    private Map<Integer, Book> booksData = new HashMap<>();

    @PostMapping
    public void newBook(@RequestBody Book newBook) {
        System.out.println(id);
        booksData.put(id, newBook);
        ++ id;
    }

    @GetMapping
    public Set<Map.Entry<Integer, Book>> getAllBook() {
        return booksData.entrySet();
    }

}