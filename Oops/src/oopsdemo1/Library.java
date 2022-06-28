package oopsdemo1;

import java.util.List;

//Composition Example
public class Library {
	List<Book100> books;
	

	public Library(List<Book100> books) {
		this.books = books;
	}


	public List<Book100> getBooks() {
		return books;
	}

	
	

}