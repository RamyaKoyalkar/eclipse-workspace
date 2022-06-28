package oopsdemo1;

public class SavingsBank extends Account {
	private int min_bal;  // can access only within the class
	protected int balance;     // can access within the class & in the sub class
	public SavingsBank(int accNo, String name, int mb, int b) {
		super();
		this.min_bal=mb;
		this.balance=b;
	}
	
	void display()
    {
            super.display(); // invoke super class method
            System.out.println ("Minimum Balance: "+min_bal);
            System.out.println ("Saving Balance: "+balance);
    }
	
}
