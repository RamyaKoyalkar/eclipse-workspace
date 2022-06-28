package oopsdemo1;

public class Employee {  //parent class/base class /super class
	int empId;
    String name;
    //generate constructors using fields
	public Employee(int empId, String name) {
		this.empId = empId;
		this.name = name;
	}
	void display()
    {
        System.out.println("********** Employee Details ***************");
        System.out.println("Employee Id :"+empId);
        System.out.println("Employee Name: "+name);
    }
    
}
