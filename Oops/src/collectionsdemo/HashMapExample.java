package collectionsdemo;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapExample {

	public static void main(String[] args) {
		HashMap<String,Double> hm=new HashMap<>();
	       
        hm.put("John", 5000.50);
        hm.put("Jim",  4200.22);
        hm.put("Daisy", 6700.50);
        hm.put("Jack", 140.21);
        hm.put("Mike", 10000.90);
       
        System.out.println("Display Customers & Balance Amount: ");
        for(String k:hm.keySet())
        {
            System.out.println(k+"-->"+hm.get(k));
        }
       
        // deposit 1000 to Jim's Account- Update value
        double bal=hm.get("Jim");
        hm.put("Jim",bal+1000);
        System.out.println("Jim's new Balance is :"+hm.get("Jim"));
       
       hm.putIfAbsent("Raj", 500.00);
      
       System.out.println(hm);
       
       Scanner s=new Scanner(System.in);
       System.out.println("Enter Customer Name for his Balance :");
       String name=s.next();
       System.out.println("The Balance of "+name+ " is :"+hm.get(name));

	}

}
