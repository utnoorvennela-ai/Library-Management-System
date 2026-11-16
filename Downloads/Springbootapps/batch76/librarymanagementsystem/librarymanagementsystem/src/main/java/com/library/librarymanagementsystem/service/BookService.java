package com.library.librarymanagementsystem.service;

import java.util.List;

import com.library.librarymanagementsystem.model.Book;

public interface BookService {

	// Create the data into database
	public abstract Book createBook(Book b);

	// Get all books info
	public abstract List<Book> getAllBooks();

	// Get one book info based on ID
	public abstract Book getBookById(Long bid);

	// update book info
	public abstract Book updateBook(Book b,Long id);

	// delete book based on id
	void deleteBookById(long id);

}
