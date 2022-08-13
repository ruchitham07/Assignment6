package com.assignment.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.assignment.model.Book;

public class BookService {
	public List<Book> getAllBooks() {
		RestTemplate restTemplate = new RestTemplate();
		String url = "http://localhost:8081/books";
		ResponseEntity<Book[]> responseEntity = restTemplate.getForEntity(url, Book[].class);
		Book[] bookDetails = responseEntity.getBody();
		return Arrays.asList(bookDetails);
	}

}
