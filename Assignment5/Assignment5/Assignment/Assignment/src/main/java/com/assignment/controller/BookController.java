package com.assignment.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.assignment.service.BookService;

@Controller
public class BookController {

	@Autowired
	BookService bookService = new BookService();

	@RequestMapping(value = "redirect", method = RequestMethod.GET)
	public String show(Model model) {
		return "showlist";
	}

	@RequestMapping(value = "books", method = RequestMethod.GET)
	public ModelAndView add(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("home");
		modelAndView.addObject("result", bookService.getAllBooks());
		return modelAndView;
	}
}
