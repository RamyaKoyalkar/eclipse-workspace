package com.wipro.velocity.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wipro.velocity.model.Product;
import com.wipro.velocity.repository.ProductRepository;

@Service
@Transactional
public class ProductService {
	
	@Autowired
	private ProductRepository prepo;
	
	//save() is User defined method in service class
	public void save(Product product)
	{
		prepo.save(product);  //invoke save() method,pre-defined in JPA repo
	}

	 public List<Product> listAll()
	 {
		 return prepo.findAll(); //invoke findAll() method,pre-defined in JPA repo
	 }
	 
	 public Product get(long id)
	 {
		 return prepo.findById(id).get();  //Pre-defined in JPA repo
	 }
	 
	 public void delete(long id)
	 {
		prepo.deleteById(id);      //Pre-defined in JPA repo
	 }
}
