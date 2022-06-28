package oopsdemo1;

public class Staff {
	private int empId;
    private String name;
    protected float salary,hra;
	public Staff(int empId, String name, float salary) {
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}
	void getHRA()
    {
        hra=(salary*60)/100;
        System.out.println("HRA :"+hra);
       
    }
   
    void display()
    {
        System.out.println(empId+" "+name+" "+salary);
    }
   
    void print()
    {
        System.out.println("Gross Salary of Staff :"+(salary+hra));
    }
    

}

