package com.wipro.velocity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.velocity.model.Dealer;

public interface DealerRepository extends JpaRepository<Dealer, Long> {
	
	/*
     * This interface has save(),findAll(),findById(),deleteById(),count()
    etc.. inbuilt methods of jpa repository for various database operations.
    This interface will be implemented by class automatically
    */
	
	//Method to fetch Object/Record based on email - Non Id field
	public Dealer findByEmail(String email);
}
