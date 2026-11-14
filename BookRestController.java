package com.excelr.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.excelr.entity.Book;
import com.excelr.service.BookService;

@RestController
public class BookRestController {

	@Autowired
	private BookService bookService;
	
	// to add a new book
	@PostMapping("/saveBook")
	public ResponseEntity<String> addBook(@RequestBody Book book)
	{
		String msg = bookService.upsertBook(book);
		
		return new ResponseEntity(msg , HttpStatus.CREATED);
	}
	
	// to update the record
	@PutMapping("/update")
	public ResponseEntity<String> updateBook(@RequestBody Book book)
	{
		String msg = bookService.upsertBook(book);
		
		return new ResponseEntity(msg , HttpStatus.CREATED);
	}
	
	//to read all the books
	
	@GetMapping("/readBooks")
	public ResponseEntity<List<Book>> getAllBooks()
	{
		List<Book> books = bookService.getAllBooks();
		return new ResponseEntity<List<Book>>(books , HttpStatus.OK);
	}
	
	
	//to delete book by id
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteBookById(@PathVariable Integer id)
	{
		String msg = bookService.deleteBookById(id);
		
		return new ResponseEntity(msg , HttpStatus.OK);
	}
}
