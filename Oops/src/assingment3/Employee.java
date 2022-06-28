package assingment3;

import java.util.Scanner;

public class Employee {
	private String name;
	private  int yearOfJoining;
	private double salary;
	private String address;
 // Scanner scan=new Scanner(System.in);
  
	public Employee(String name, int yearOfJoining, double salary, String address) {
		this.name = name;
		this.yearOfJoining = yearOfJoining;
		this.salary = salary;
		this.address = address;
	}
 /* void setData()
  {
	  System.out.println("Name   yearofjoining  Address");
      System.out.println("Enter name,year of joining,salary,address");
	 name=scan.next();
	 yearOfJoining=scan.nextInt();
	 salary=scan.nextDouble();
	 address=scan.next();
  }*/
  void display()
  {
	  //System.out.println("Name   yearofjoining  Address");
	  System.out.println(""+name+" "+yearOfJoining+" "  +" "+address);
	  
  }
}
