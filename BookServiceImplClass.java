package com.excelr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.excelr.entity.Book;
import com.excelr.repository.BookRepo;   // fixed package name

@Service
public class BookServiceImplClass implements BookService {

    @Autowired
    private BookRepo bookRepo;

    // insert (id == null) or update (id present)
    @Override
    public String upsertBook(Book book) {
        boolean isNew = (book.getId() == null);
        Book saved = bookRepo.save(book);
        String action = isNew ? "Inserted: " : "Updated: ";
        return action + saved.getId() + " " + saved.getName() + " " + saved.getPrice();
    }

    // read all books
    @Override
    public List<Book> getAllBooks() {
        return bookRepo.findAll();
    }

    // delete by id
    @Override
    public String deleteBookById(Integer id) {
        if (bookRepo.existsById(id)) {
            bookRepo.deleteById(id);
            return "Book deleted";
        }
        return "Book not found with id " + id;
    }
}