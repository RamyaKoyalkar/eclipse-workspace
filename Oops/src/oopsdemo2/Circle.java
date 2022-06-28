package oopsdemo2;

public class Circle implements Shape {
 
	private double radius;
	//generate constructors using fields
	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public void draw() {
		System.out.println("Drawing Circle");
	}

	@Override
	public double getArea() {
		return Math.PI*this.radius*this.radius;
	}
//generate getter() for radius
	public double getRadius() {
		return radius;
	}
  
}
