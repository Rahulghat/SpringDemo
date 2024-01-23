package com.spring3.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring3.demo.model.Author;
import com.spring3.demo.service.AuthorService;

@Controller
public class AuthorController {

	private final AuthorService authorService;

	public AuthorController(AuthorService authorService) {
		super();
		this.authorService = authorService;
	}

	@RequestMapping("/Authors")
	public String getAuthors(Model model) {

		Iterable<Author> authors = authorService.findAll();
		model.addAttribute("authors", authors);
		return "Authors";

	}

}
