package oopsdemo1;

public class MultiLevel2 {

	public static void main(String[] args) {
		Director d1=new Director(101,"Keane",5000);
	       
        System.out.println("*********** Director Details ***********");
        d1.display(); // staff
        d1.getHRA();  // staff
        d1.getDA();  // manager
        d1.getTA();  // director
        d1.getGross();  //director
        
        Manager m1=new Manager(201,"Mary",4000);
        
        System.out.println("*********** Manager Details ***********");
        m1.display();
        m1.getHRA();
        m1.getDA();
        m1.getGross();
        
        Staff s1=new Staff(301,"Helen",2000);
        System.out.println("*********** Staff Details ***********");
        s1.display();
        s1.getHRA();
        s1.print();

	}

}
