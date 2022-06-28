package oopsdemo;

public class ThisDemo {
	int age;
	 //instance method
    // this keyword is used in instance method to access Object
    void init(int age)
    {
      // this keyword refers to the current object which invokes the method
    	this.age=age;
    }

	public static void main(String[] args) {
		ThisDemo td1=new ThisDemo();
		td1.init(20);
		System.out.println("The value of age is:"+td1.age);
		
		
	}

}
