package com.wipro.velocity.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.wipro.velocity.model.Dealer;

public interface DealerRepository extends MongoRepository<Dealer, String> {
	
	//Custom method to fetch Dealer Object based non id field
	public Optional<Dealer> findByEmail(String email);

}
