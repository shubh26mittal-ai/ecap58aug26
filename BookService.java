package com.excelr.service;

import java.util.List;

import com.excelr.entity.Book;

public interface BookService {

    String upsertBook(Book book);
	
	List<Book> getAllBooks();
	
	
	String deleteBookById(Integer id);
}
