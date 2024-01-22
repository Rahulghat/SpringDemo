package com.spring3.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.spring3.demo.entity.Author;

public interface AuthorRepository extends CrudRepository<AuthorRepository, Long> {

}
