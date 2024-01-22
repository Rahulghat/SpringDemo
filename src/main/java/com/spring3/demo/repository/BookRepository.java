package com.spring3.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.spring3.demo.model.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

}
