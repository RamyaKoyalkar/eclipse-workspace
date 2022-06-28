package oopsdemo2;

public class Car {
	String company;
    boolean isAutomatic;
    String modelName;
    float highTechAC;
    String color;
    String fuelType;
    String Power;
    int numberOfGear;
	public Car(String company, boolean isAutomatic, String modelName, float highTechAC, String color, String fuelType,
			String power, int numberOfGear) {
		this.company = company;
		this.isAutomatic = isAutomatic;
		this.modelName = modelName;
		this.highTechAC = highTechAC;
		this.color = color;
		this.fuelType = fuelType;
		Power = power;
		this.numberOfGear = numberOfGear;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public boolean isAutomatic() {
		return isAutomatic;
	}
	public void setAutomatic(boolean isAutomatic) {
		this.isAutomatic = isAutomatic;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public float getHighTechAC() {
		return highTechAC;
	}
	public void setHighTechAC(float highTechAC) {
		this.highTechAC = highTechAC;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public String getPower() {
		return Power;
	}
	public void setPower(String power) {
		Power = power;
	}
	public int getNumberOfGear() {
		return numberOfGear;
	}
	public void setNumberOfGear(int numberOfGear) {
		this.numberOfGear = numberOfGear;
	}
    
}
