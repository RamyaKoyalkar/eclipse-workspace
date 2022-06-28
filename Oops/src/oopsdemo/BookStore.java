package oopsdemo;

import java.util.Scanner;

public class BookStore {
	private long bookId;
    private String authorName;
    private String bookName;
    private double bookPrice;
    Scanner s=new Scanner(System.in);
    public void inputBookDetails() // method definition
    {
        System.out.println("Enter Book ID, authorName, bookName & bookprice :");
        bookId=s.nextInt();
        authorName=s.next();
        bookName=s.next();
        bookPrice=s.nextFloat();
    }
    public void displayBookDetails()
    {
        System.out.println("************* Book Details ***********");
        System.out.println("Book Id   :  "+bookId);
        System.out.println("Author Name:"+authorName);
        System.out.println("BookName:"+bookName);
        System.out.println("BookPrice:"+bookPrice);
    }

}
