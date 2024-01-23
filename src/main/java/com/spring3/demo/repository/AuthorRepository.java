package com.spring3.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.spring3.demo.model.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
