package assingment5;

public class TruckDaewoo implements Truck {
	 int axles;
	 int totalWeight;
	 
	 
	public TruckDaewoo(int axles, int totalWeight) {
		super();
		this.axles = axles;
		this.totalWeight = totalWeight;
	}
	
	@Override
	public int getAxles() {
		return axles;
	}
	@Override
	public int totalweight() {
		return totalWeight;
	}
	
	
}
