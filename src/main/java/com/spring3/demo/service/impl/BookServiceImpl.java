package com.spring3.demo.service.impl;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.spring3.demo.model.Book;
import com.spring3.demo.repository.BookRepository;
import com.spring3.demo.service.BookService;

@Service
public class BookServiceImpl implements BookService {

	private final BookRepository bookRepository;

	public BookServiceImpl(BookRepository bookRepository) {
		super();
		this.bookRepository = bookRepository;
	}

	@Override
	public Iterable<Book> findAll() {
		// TODO Auto-generated method stub
		return bookRepository.findAll();
	}

}
