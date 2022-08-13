package com.nagarro.book.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nagarro.book.domain.Book;

public interface BookRepo extends JpaRepository<Book, Integer> {

}
