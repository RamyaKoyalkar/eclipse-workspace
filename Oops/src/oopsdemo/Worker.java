package oopsdemo;

import java.util.Scanner;

public class Worker {
	int workid;
	long salary;
	float hrs;
	Scanner sc=new Scanner(System.in);
	void getInfo()
	{
		System.out.println("salaryindollars,noofhrs");
		salary=sc.nextLong();
		hrs=sc.nextFloat();
	}
	void addSalary()
	{
		if(salary<500)
			salary+=10;
	}
	void addwork()
	{
		if(hrs>6)
			salary+=5;
	}
	void display()
	{
		System.out.println("THe final salary of an employee is:"+salary);
	}

}
