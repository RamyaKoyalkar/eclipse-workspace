package com.wipro.velocity.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.wipro.velocity.model.Product;

public interface ProductRepository extends MongoRepository<Product, String> {
	
	//Custom method to find Products based on madein field
	List<Product> findByMadein(String madein);
	

}
