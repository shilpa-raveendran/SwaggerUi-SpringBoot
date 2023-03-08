package com.example.springswaggerUI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.springswaggerUI.entity.Book;
import com.example.springswaggerUI.service.BookServiceImpl;

@RestController
@RequestMapping("/books")
public class BookController {

	@Autowired
	private BookServiceImpl bookServiceImpl;

	@GetMapping("/getAllBooks")
	public List<Book> getAllBooks() {
		return bookServiceImpl.getAllBooks();
	}

	@GetMapping("/getBookById")
	public Book getBookById(@RequestParam("bookId") int bookId) {
		return bookServiceImpl.getBookById(bookId);
	}

	@PostMapping("/saveBook")
	public String saveBook(@RequestBody Book book) {
		return bookServiceImpl.saveBook(book);
	}

	@DeleteMapping("/deleteBook")
	public String delete(@RequestParam("bookId") int bookId) {
		return bookServiceImpl.deleteBook(bookId);

	}
}
