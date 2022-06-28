package oopsdemo1;

public class AccountsCandidate extends Candidate {
	
     double perks;
     
	public AccountsCandidate(int id, String name, double salary) {
		super(id, name, salary);
		
	}
	void getPerks()
    {
        perks= salary*.05;
        System.out.println("Perks of Accounts Candidate is :"+perks);
	

}

}