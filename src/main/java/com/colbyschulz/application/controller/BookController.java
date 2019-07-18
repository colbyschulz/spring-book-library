package com.colbyschulz.application.controller;

import com.colbyschulz.application.exception.EntityNotFoundException;
import com.colbyschulz.application.model.Book;
import com.colbyschulz.application.persistence.Persistence;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/books")
public class BookController {

    private Persistence persistence;

    public BookController(Persistence persistence) {
        this.persistence = persistence;
    }

    @PostMapping
    public ResponseEntity addBook(@Valid @RequestBody Book book) {
        return ResponseUtility.buildCreatedResponse(persistence.addBook(book));
    }

    @GetMapping
    public ResponseEntity getAllBooks() {
        return ResponseUtility.buildOkResponse(persistence.getAllBooks());
    }

    @GetMapping("/{bookId}")
    public ResponseEntity getBookById(@PathVariable Integer bookId) throws EntityNotFoundException {
        return ResponseUtility.buildOkResponse(persistence.getBookById(bookId));
    }

}