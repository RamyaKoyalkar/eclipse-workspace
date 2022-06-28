package assingment3;

import java.util.Scanner;

public class Employee1 {
   int salary;
   int noOfWorkingHours;
   Scanner scan = new Scanner(System.in);
   void getInfo()
   {
	   System.out.println("Enter the salary:");
	   salary=scan.nextInt();
	   System.out.println("Enter the number of working hours:");
	   noOfWorkingHours=scan.nextInt();
   }
    void addSal()
    {
    	if(salary< 500)
    	salary=salary+10;
    }
    void addWork()
    {
    	if(noOfWorkingHours>6)
    		salary=salary+5;
    }
    void display()
    {
    	System.out.println("The final salary of the employee is:" +salary);
    }
}
