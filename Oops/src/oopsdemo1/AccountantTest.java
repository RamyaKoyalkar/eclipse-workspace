package oopsdemo1;
/*
 * Program to implement Single Inheritance
 */

public class AccountantTest {

	public static void main(String[] args) {
		Accountant ac1=new Accountant(201,"Guarav Sharma","Process salary of employees","SAP");
		Accountant ac2=new Accountant(202,"Marry Jhon","Payment to vendors","Tally");
		
        ac1.display();   //base class
        ac1.print();     //derived class
        ac2.display();
        ac2.print();
	}

}
