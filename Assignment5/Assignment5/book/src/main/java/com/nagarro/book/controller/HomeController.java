package com.nagarro.book.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.book.dao.BookRepo;
import com.nagarro.book.domain.Book;

@RestController
public class HomeController {

	@Autowired
	BookRepo repo;

	// postman add data

	@PostMapping("/book")
	public Book addBook(Book b) {
		repo.save(b);
		return b;
	}

	// postman get data

	@GetMapping("/books")

	@ResponseBody
	public List<Book> getBooks() {
		return repo.findAll();
	}

	@PutMapping("/Book")
	public Book saveOrUpdateBook(Book b) {
		repo.save(b);
		return b;
	}

	@RequestMapping("/book/{id}")

	@ResponseBody
	public Optional<Book> getBook(@PathVariable("id") int id) {
		return repo.findById(id);
	}

	@DeleteMapping("/book/{id}")
	public String deleteEmployee(@PathVariable int id) {
		Book e = repo.getOne(id);
		repo.delete(e);
		return "deleted";
	}
}
