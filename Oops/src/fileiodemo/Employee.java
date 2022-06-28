package fileiodemo;

import java.io.Serializable;

//Employee class  is serializable -- save state of an object
public class Employee implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public String name;
    public String address;
    public transient int SSN; //variable which cannot be serialised
    public int number;
    
	public Employee(String name, String address, int sSN, int number) {
		this.name = name;
		this.address = address;
		SSN = sSN;
		this.number = number;
	}
	
	public void mailCheck()
    {
        System.out.println("Mailing a check to " + name
                + " " + address);
    }
    
}
