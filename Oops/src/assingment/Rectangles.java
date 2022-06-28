package assingment;

public class Rectangles {
	 float length;
	 float breadth;
	public Rectangles(float length, float breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	public float area()
	{
		float area=length*breadth;
		return area;
	}
	public float perimeter()
	{
		float perimeter=2*(length+breadth);
		return perimeter;
	}
}
