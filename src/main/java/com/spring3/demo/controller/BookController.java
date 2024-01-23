package com.spring3.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring3.demo.service.BookService;

@Controller
public class BookController {

	private final BookService bookService;

	@Autowired
	public BookController(BookService bookService) {
		super();
		this.bookService = bookService;
	}

	@RequestMapping("/books")
	public String getBook(Model model, String attributeName) {

		model.addAttribute(bookService.findAll());

		return "books ";

	}

}
