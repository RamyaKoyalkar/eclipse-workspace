package com.wipro.velocity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.velocity.model.Book;
import com.wipro.velocity.repository.BookRepository;


/*
RestController is used for making restful web services with the help of the @RestController annotation. 
This annotation is used at the class level and allows the class to handle the requests made by the client. 

RestController allows to handle all REST APIs such as GET, POST, Delete, PUT requests. 
@RestController manages REST data in json format.
*/
@RestController
public class BookController {
	
	@Autowired
	private BookRepository brepo;
	
	// POST - http://localhost:8989/addBook
	@PostMapping("/addBook")
	public String saveBook(@RequestBody Book book)
	{
		brepo.save(book);
		
		return"Book Object Added Successfully";
	}
	
	// GET - http://localhost:8989/findAllBooks
	@GetMapping("/findAllBooks")
	public List<Book> getBooks()
	{
		return brepo.findAll();
	}
	
	// DELETE - http://localhost:8989/delete/1329
	@DeleteMapping("/delete/{id}")
	public String deleteBook(@PathVariable int id)
	{
		brepo.deleteById(id);
		
		return "Book Object Deleted Successfully";
	}
	
	

}
