package com.spring3.demo.service;

import com.spring3.demo.model.Author;
import com.spring3.demo.model.Book;
import com.spring3.demo.repository.AuthorRepository;

public interface AuthorService {

	public Iterable<Author> findAll();

}
