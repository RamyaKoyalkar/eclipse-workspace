package streamdemo;

public class MusicalInstrument {
	private String name;
    private String type;
    private double price;
    
    //generate constructors using fields
	public MusicalInstrument(String name, String type, double price) {
		this.name = name;
		this.type = type;
		this.price = price;
	}

	//generate getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	//generate to String method
	@Override
	public String toString() {
		return "MuscialInstruments [name=" + name + ", type=" + type + ", price=" + price + "]";
	}
    
	
    
}
