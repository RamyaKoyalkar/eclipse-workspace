package oopsdemo;

public class BookTest {

	public static void main(String[] args) {
		Book b1=new Book();
		b1.setBookId(101);
		b1.setBookName("The programmin in c");
		b1.setPrice(500);
		b1.setPublisher("Prime Books");
		//invoke getter methods --output
        System.out.println("******* Book Details ********");
        b1.display();
        System.out.println(b1.getBookId()+ " "+b1.getBookName()+" "+b1.getPrice()+" "+
                                b1.getPublisher());
        System.out.println("Discounted Price of Book :"+b1.discountPrice());
       
        System.out.println(b1);// invokes toString() method of the instance class
        Book b2=new Book();
        
        b2.setBookId(102);
        b2.setBookName("Python");
        b2.setPrice(600);
        b2.setPublisher("BPB Publisher");
       
        System.out.println("******* Book Details ********");
        System.out.println(b2.getBookId()+ " "+b2.getBookName()+" "+b2.getPrice()+" "+b2.getPublisher());
        System.out.println("Discounted Price of Book :"+b2.discountPrice());
       
        System.out.println(b2);

	}

}

