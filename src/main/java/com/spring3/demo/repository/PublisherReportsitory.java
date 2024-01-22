package com.spring3.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.spring3.demo.model.Publisher;

public interface PublisherReportsitory extends CrudRepository<Publisher, Long> {

}
