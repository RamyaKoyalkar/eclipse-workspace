package oopsdemo2;

public abstract class Trainee {
	private String name;
    private String address;
    private int number;
    
	public Trainee(String name, String address, int number) {
		this.name = name;
		this.address = address;
		this.number = number;
	}
	//abstract method declaration-must be over ridden in the derived class
    public abstract double calculateMarks();
    void show()
    {
        System.out.println("Display Marks for :" +this.name+ " "+this.address);
    }
	@Override
	public String toString() {
		return "Trainee [name=" + name + ", address=" + address + ", number=" + number + "]";
	}
}
