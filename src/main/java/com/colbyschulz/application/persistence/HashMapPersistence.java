
package com.colbyschulz.application.persistence;

import com.colbyschulz.application.exception.EntityNotFoundException;
import com.colbyschulz.application.model.Book;
import com.colbyschulz.application.model.User;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@Repository
public class HashMapPersistence implements Persistence {

    private Map<Integer, User> userMap = new HashMap<>();
    private Map<Integer, Book> bookMap = new HashMap<>();
    private Integer userIdCounter = 0;
    private Integer bookIdCounter = 0;

    @Override
    public Integer addUser(User user) {
        userMap.put(++userIdCounter, user);
        return userIdCounter;
    }

    @Override
    public Set<Map.Entry<Integer, User>> getAllUsers() {
        return userMap.entrySet();
    }

    @Override
    public User getUserById(Integer userId) throws EntityNotFoundException {

        User user = userMap.get(userId);

        if (user == null) {
            throw new EntityNotFoundException();
        }

        return user;

    }

    @Override
    public Integer addBook(Book book) {
        bookMap.put(++bookIdCounter, book);
        return bookIdCounter;
    }

    @Override
    public Set<Map.Entry<Integer, Book>> getAllBooks() {
        return bookMap.entrySet();
    }

    @Override
    public Book getBookById(Integer bookId) throws EntityNotFoundException {

        Book book = bookMap.get(bookId);

        if (book == null) {
            throw new EntityNotFoundException();
        }

        return book;

    }
}