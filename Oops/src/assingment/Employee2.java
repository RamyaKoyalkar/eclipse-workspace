package assingment;

public class Employee2 extends Member {
	String Specialisation;
	public Employee2(String name, int age, String phoneNumber, String address, double salary,String specialisation) {
		super(name, age, phoneNumber, address, salary);
		this.Specialisation = specialisation;
	}

}
