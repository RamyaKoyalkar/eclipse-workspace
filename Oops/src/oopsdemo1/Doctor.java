package oopsdemo1;
//Java program to implement Hierarchical Inheritance
public class Doctor {
	int idNumber;
    String name;
    String address;
	public Doctor(int idNumber, String name, String address) {
		this.idNumber = idNumber;
		this.name = name;
		this.address = address;
	}
	void display() {
        System.out.println("********* Doctor Details ***********");
        System.out.println("The name is :" + name);
        System.out.println("The number is :" + idNumber);
        System.out.println("The address is :" + address);
   }
    

}
