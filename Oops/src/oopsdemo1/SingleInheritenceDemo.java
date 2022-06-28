package oopsdemo1;

public class SingleInheritenceDemo {

	public static void main(String[] args) {
		
	    Developer d1=new Developer(101,"James Gosling","JDBC");// invoke derived class constructor
        Developer d2=new Developer(105,"Rod Jhonson","Spring Framework");
       
       
        d1.display(); // child class object invokes parent class method
        d1.display1(); // child class object invoke child class method
       
        d2.display();
        d2.display1();

	}

}
