package assingment;

public class Member {
	 private String name;
	    private int age;
	    private String phoneNumber;
	    private String address;
	    private double salary;

	    public Member(String name, int age, String phoneNumber, String address, double salary) {
	        this.name = name;
	        this.age = age;
	        this.phoneNumber = phoneNumber;
	        this.address = address;
	        this.salary = salary;
	    }

	    public void printSalary() {
	        System.out.println("Salary " + salary);
	    }
}
