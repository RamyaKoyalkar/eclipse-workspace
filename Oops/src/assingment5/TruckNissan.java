package assingment5;

public class TruckNissan implements Truck {
	 int axles;
	 int totalWeight;
	 
	 
	public TruckNissan(int axles, int totalWeight) {
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
