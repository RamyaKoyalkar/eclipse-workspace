package oopsdemo1;

import java.util.ArrayList;
import java.util.List;

public class LibraryCompositionDemo {

	public static void main(String[] args) {
		// Creating the Objects of Book class.
        Book100 b1 = new Book100("EffectiveJ Java", "Joshua Bloch");
        Book100 b2 = new Book100("Thinking in Java", "Bruce Eckel");
        Book100 b3 = new Book100("Java: The Complete Reference", "Herbert Schildt");
        List<Book100> books = new ArrayList<Book100>();
        books.add(b1);
        books.add(b2);
        books.add(b3);
        //Library objects with books list
        Library lib=new Library(books);
        List<Book100> bks = lib.getBooks();
        for(Book100 bk : bks){

            System.out.println("Title : " + bk.title + " and "
            +" Author : " + bk.author);
	}

}
}
