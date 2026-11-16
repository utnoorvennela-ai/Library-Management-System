package com.library.librarymanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.library.librarymanagementsystem.model.Book;
import com.library.librarymanagementsystem.service.BookService;

//http://localhost:8888/book/hello
@CrossOrigin(origins="http://localhost:3000")
@RestController
@RequestMapping("/book")
public class BookController {
	
	@Autowired
	BookService bookService;
	
	@GetMapping("/hello")
	String myBook() {
		return "Welcome to my library";
	}
	
	//http://localhost:8888/book/update/1
	@PutMapping("/update/{id}")
	Book updateBook(@RequestBody Book b,@PathVariable Long id){
		return bookService.updateBook(b, id);
	}
	
	//http://localhost:8888/book/getbook/3
	@GetMapping("/getbook/{id}")
	Book getBook(@PathVariable Long id){
		return bookService.getBookById(id);
	}
	@GetMapping("/getAllBooks")
	//http://localhost:8888/book/getAllBooks
	List<Book> getBookLists(){
		return bookService.getAllBooks();
	}
	
	//http://localhost:8888/book/books
	@PostMapping("/books")
	Book createBook(@RequestBody Book b) {
		return bookService.createBook(b);
	}
	
	//http://localhost:8888/book/delete/5
	@DeleteMapping("/delete/{id}")
	String deleteBook(@PathVariable Long id){
		bookService.deleteBookById(id);
		return "book deleted successfully";
	}

}
