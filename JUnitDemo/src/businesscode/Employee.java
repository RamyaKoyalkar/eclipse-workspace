package businesscode;

import java.util.Objects;

public class Employee {
 
	private int empId;
    private String name;
    private int salary;
    
    //generate constructors using fields
	public Employee(int empId, String name, int salary) {
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}
 
	//generate getters and setters
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
     
	//generate hash code
	@Override
	public int hashCode() {
		return Objects.hash(empId, name, salary);
	}

	//generate equals code
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return empId == other.empId && Objects.equals(name, other.name) && salary == other.salary;
	}
    
	public static String getEmpNameWithHighestSalary(){
        /**   * logic to get Highest paid employee        */
        return "Raj";
    }
    
    public static Employee getHighestPaidEmployee(){
        /**  * hiding logic to get highest paid employee     */
        return new Employee(101, "Raj", 15000);
    }
}
