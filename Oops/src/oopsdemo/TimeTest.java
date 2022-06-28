package oopsdemo;

public class TimeTest {

	public static void main(String[] args) {
		Time t1=new Time(12,45,55); // invokes constructor & initialize the values
        Time t2=new Time(10,30,30);
       
        t1.add(t2); // invoke add method & pass t2 Object as argument
       
        System.out.println("The Addition of 2 Times is : ");
        t1.display();
		
	
	}
}
