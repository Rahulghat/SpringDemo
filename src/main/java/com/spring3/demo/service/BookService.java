package com.spring3.demo.service;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.spring3.demo.model.Book;

public interface BookService {

	public Iterable<Book> findAll();

}
