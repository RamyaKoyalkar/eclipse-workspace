package oopsdemo1;
//Multilevel Inheritance
public class Account {    // base class for Savings Account
	int accNo;
    String name;
	
	
    void display()
    {
        System.out.println("************ Account Details ************");
        System.out.println("Account Number :"+accNo);
        System.out.println("Customer Name :"+name);
	
	}
    
}
