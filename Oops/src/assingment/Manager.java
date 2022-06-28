package assingment;

public class Manager extends Member {
	String Department;
	
	public Manager(String name, int age, String phoneNumber, String address, double salary,String department) {
		super(name, age, phoneNumber, address, salary);
		this.Department = department;
	}

}
