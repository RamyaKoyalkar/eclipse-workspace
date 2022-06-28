package streamdemo;

public class Book {
	int id;
    String name,author,publisher;
    int quantity;
    
    //generate constructor using fields
	public Book(int id, String name, String author, String publisher, int quantity) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}
    
    
}
