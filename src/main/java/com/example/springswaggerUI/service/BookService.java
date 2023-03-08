package com.example.springswaggerUI.service;

import java.util.List;

import com.example.springswaggerUI.entity.Book;

public interface BookService {

	public String saveBook(Book book);

	public Book getBookById(int bookId);

	public List<Book> getAllBooks();

	public String deleteBook(int bookId);
}
