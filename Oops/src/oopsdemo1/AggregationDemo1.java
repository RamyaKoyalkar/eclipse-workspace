package oopsdemo1;

public class AggregationDemo1 {

	public static void main(String[] args) {
		Author author = new Author("John", 42, "USA");
	       
        Publisher publisher = new Publisher("Sun Publication","JDSR-III4", "LA");
       
        Book b = new Book("Java for Begginer",800, author,publisher);
       
        b.display();

	}

}
