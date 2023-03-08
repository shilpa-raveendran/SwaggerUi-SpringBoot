package com.example.springswaggerUI.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springswaggerUI.dao.BookRepository;
import com.example.springswaggerUI.entity.Book;


@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookRepository bookRepo;

	@Override
	public String saveBook(Book book) {
		bookRepo.save(book);
		return "Saved Booked id :" + book.getBookId();
	}

	@Override
	public Book getBookById(int bookId) {
		Optional<Book> book = bookRepo.findById(bookId);
		Book theBook = null;

		if (book.isPresent()) {
			theBook = book.get();
		}
//		} else {
//			throw new RuntimeException("Did not find Book id - " + bookId);
//		}

		return theBook;
		
	}

	@Override
	public String deleteBook(int bookId) {
		bookRepo.deleteById(bookId);
		return "Deleted Booked id :" + bookId;
	}

	@Override
	public List<Book> getAllBooks() {
		
		return bookRepo.findAll();
	}
}
