package com.colbyschulz.application.persistence;

import com.colbyschulz.application.exception.EntityNotFoundException;
import com.colbyschulz.application.model.User;
import com.colbyschulz.application.model.Book;

import java.util.Map;
import java.util.Set;

public interface Persistence {

    //Users
    Integer addUser(User user);

    Set<Map.Entry<Integer, User>> getAllUsers();

    User getUserById(Integer userId) throws EntityNotFoundException;


    //Books
    Integer addBook(Book book);

    Set<Map.Entry<Integer, Book>> getAllBooks();

    Book getBookById(Integer bookId) throws EntityNotFoundException;
}