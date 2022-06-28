package oopsdemo;

import java.util.Scanner;

//main class to test Employee class methods

public class EmployeeTest {

	public static void main(String[] args) {
		// create Objects e1,e2,e3 of Employee Class
        Employee e1=new Employee(); // invoke default constructor
        Employee e2=new Employee();
        Employee e3=new Employee();
        
        //invoke Methods (Method call)
        e1.inputEmployeeDetails(); // p1.eat();
        e1.calculateNetSalary();
        e1.displayEmployeeDetails();
       
        e2.inputEmployeeDetails();
        e2.calculateNetSalary();
        e2.displayEmployeeDetails();
       
        e3.inputEmployeeDetails();
        e3.calculateNetSalary();
        e3.displayEmployeeDetails();

	}

}
