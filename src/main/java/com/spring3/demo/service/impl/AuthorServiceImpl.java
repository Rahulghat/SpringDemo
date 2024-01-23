package com.spring3.demo.service.impl;

import org.springframework.stereotype.Service;

import com.spring3.demo.model.Author;
import com.spring3.demo.repository.AuthorRepository;
import com.spring3.demo.service.AuthorService;

@Service
public class AuthorServiceImpl implements AuthorService {

	private final AuthorRepository authorRepository;

	public AuthorServiceImpl(AuthorRepository authorRepository) {
		super();
		this.authorRepository = authorRepository;
	}

	@Override
	public Iterable<Author> findAll() {

		Iterable<Author> authors = authorRepository.findAll();

		return authors;
	}

}
