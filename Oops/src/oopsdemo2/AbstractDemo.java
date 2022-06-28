package oopsdemo2;

public class AbstractDemo {

	public static void main(String[] args) {
		Trainee t1 = new Marks("John","New York",1001,35);    
		t1.show();
		double marks = t1.calculateMarks();//invoke sub class method
		System.out.println(t1+" "+marks);
		
 
	}
}