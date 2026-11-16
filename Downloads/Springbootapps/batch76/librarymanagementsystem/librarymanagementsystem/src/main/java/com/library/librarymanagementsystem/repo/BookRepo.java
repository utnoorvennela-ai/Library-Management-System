package com.library.librarymanagementsystem.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.library.librarymanagementsystem.model.Book;

@Repository
public interface BookRepo extends JpaRepository<Book, Long> {

}
