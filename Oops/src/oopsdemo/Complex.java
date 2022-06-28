package oopsdemo;
    
	// Program to add 2 complex numbers- Real & Imaginary part
	public class Complex {
	    
	    double real;
	    double imaginary;
	    
	        // Generate Constructor using fields
	    public Complex(double real, double imaginary) { // parameterized constructor
	        this.real = real;
	        this.imaginary = imaginary;
	    }

	 

	    void add(Complex obj) // method which accepts object as an argument
	    {
	        //c1.real+=c2.real
	        this.real+=obj.real;
	        //c1.imaginary+=c2.realimaginary
	        this.imaginary+=obj.imaginary;
	    }
	    void add3(Complex obj1,Complex obj2 ) // method which accepts object as an argument
	    {
	        //c1.real+=c2.real
	        this.real=this.real+obj1.real+obj2.real;
	        //c1.imaginary+=c2.realimaginary
	        this.imaginary=this.imaginary+obj1.imaginary+obj2.imaginary;
	    }
	    
	    void display()
	    {
	        System.out.println("r"+this.real+" + i"+this.imaginary);
	    }

	 

	}
	 

