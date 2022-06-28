package assingment;

public class MemberTest {

	public static void main(String[] args) {
		 Employee2 emp = new Employee2("pavan", 21, "9502198979", "Guntur", 80000,"Java");
	        Manager manager = new Manager("siva", 24, "9133439315", "Chennai", 70000, "IT");
	        emp.printSalary();
	        manager.printSalary();

	}

}
