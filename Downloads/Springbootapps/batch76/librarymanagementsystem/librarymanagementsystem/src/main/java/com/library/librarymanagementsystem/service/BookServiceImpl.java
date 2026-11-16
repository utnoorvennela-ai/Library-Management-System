package com.library.librarymanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.librarymanagementsystem.model.Book;
import com.library.librarymanagementsystem.repo.BookRepo;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	BookRepo bookRepo;

	@Override
	public Book createBook(Book b) {
		return bookRepo.save(b);
	}

	@Override
	public List<Book> getAllBooks() {
		return  bookRepo.findAll();//select * from book
	}

	@Override
	public Book getBookById(Long id) {
		return bookRepo.findById(id).get();//select * from book where bid=2;
	}

	@Override
	public Book updateBook(Book b,Long id) {
		Book bookFromDB=getBookById(id);
		bookFromDB.setAuthor(b.getAuthor());
		bookFromDB.setAvailableCopies(b.getAvailableCopies());
		bookFromDB.setBtitle(b.getBtitle());
		bookFromDB.setTotalCopies(b.getTotalCopies());
		return bookRepo.save(bookFromDB);
	}

	@Override
	public void deleteBookById(long id) {
		bookRepo.deleteById(id);// delete table book where bid=1
		
	}

}
