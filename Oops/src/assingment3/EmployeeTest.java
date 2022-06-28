package assingment3;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee e1=new Employee("Robert"  , 1994  ,40000.0 , "64C- WallsStreet");
		Employee e2=new Employee("Sam"  ,  2000  ,400000.0,  "68D- WallsStreet");
		Employee e3=new Employee("John"  , 1999 , 600000.0, "26B- WallsStreet");
		/*e1.setData();
		e2.setData();
		e3.setData();*/
		e1.display();
		e2.display();
		e3.display();
	}

}
