package oopsdemo;

import java.util.Scanner;

//instance class
public class Student {
	//properties /state/attributes
	//Private variables can be accessed only within the classes
    private int rollNumber;
    private String name,course;
    private float m1,m2,m3,total;
    Scanner s=new Scanner(System.in);
  //instance methods /behavior/ functions
    
    public void input()
    {
        System.out.println("Enter  Roll No,Name,course:");
        rollNumber=s.nextInt();
        name=s.next();
        course=s.next();
       
        System.out.println("Enter marks of 3 subjects:");
        m1=s.nextFloat();
        m2=s.nextFloat();
        m3=s.nextFloat();
    }
        public float calculate()      //method with return type float
        {
        	total=m1+m2+m3;
        	return total;
        }
        public void display()
        {
            System.out.println("******* Student Details *************");
            System.out.println("Roll No     :"+rollNumber);
            System.out.println("Name        :"+name);
            System.out.println("Course      :"+course);
            System.out.println("Total Marks :"+total);
            System.out.println("*************************************");
        }
    }

