package oopsdemo1;

public class Specialist extends Doctor {
	
     String speciality;
     
	public Specialist(int idNumber, String name, String address,String sp) {
		super(idNumber, name, address);
		this.speciality=sp;
		
	}
	void display() {
        super.display(); // call base class method
        System.out.println("The speciality is :" + speciality);
        }	

}
