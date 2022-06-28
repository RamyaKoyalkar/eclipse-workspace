package com.wipro.velocity.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.wipro.velocity.model.Book;

public interface BookRepository extends MongoRepository<Book, Integer> {
	

}
