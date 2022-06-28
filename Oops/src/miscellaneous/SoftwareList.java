package miscellaneous;

import com.wipro.training.microsoft.OperatingSystem;
import com.wipro.training.orcale.Database;

//Demonstrate the use of Packages
public class SoftwareList {

	public static void main(String[] args) {
		Database d1=new Database();
		d1.printSoftware();
		System.out.println("-------------------");
		
        OperatingSystem op1=new OperatingSystem();
        op1.listSoftware();
	}

}
