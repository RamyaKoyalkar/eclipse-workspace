package oopsdemo1;

class Bank    //base class
{
    int getRateofInterest()
    {
        return 0;
    }
    void display()
    {
        System.out.println("Welcome to Bank");
    }
}
    
   class SBI extends Bank
    {
	  int getRateOfInterest()    //overridden method
	{
		return 5;
	}
    }
	class ICICI extends Bank
	{
		int getRateOfInterest()
		{
			return 7;
		}
	}
	class Axis extends Bank
	{
		int getRateOfInterest()
		{
			return 6;
		}
	}
    
public class OverrideDemo {
	
	public static void main(String[] args){
		SBI b1=new SBI();
        ICICI b2=new ICICI();
        Axis b3=new Axis();
       
        b1.display();/// base class method
       
        // invoke overridden method getRateofInterest() in SBI Class
        System.out.println("The Interest Rate of SBI is :"+b1.getRateofInterest());
       
        b2.display();/// base class method
       
        // invoke overridden method getRateofInterest() in ICICI Class
        System.out.println("The Interest Rate of ICICI is :"+b2.getRateofInterest());
       
        b3.display();/// base class method
       
        // invoke overridden method getRateofInterest() in AXIS Class
        System.out.println("The Interest Rate of Axis is :"+b3.getRateofInterest());

	  }

    }


