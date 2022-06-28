package oopsdemo2;
abstract class Animal
{
    public void eat()
    {
        System.out.println("I can eat");
    }
   
    abstract void makeSound(); // abstract method- without body
}
class Dog extends Animal{

	@Override
	void makeSound() {
		System.out.println("Bark...Bark...");
		
	}
	
}
class Cat extends Animal{

	@Override
	void makeSound() {
		System.out.println("Meow...Meow...");
		
	}
	
}
public class AnimalAbstractionTest {

	public static void main(String[] args) {
		 // Compiler error - Cannot create instance of Abstract class
	    //    Animal a =new Animal();
	       
	        Dog d1=new Dog();
	       
	        d1.makeSound();
	        d1.eat();
	       
	        Cat c1=new Cat();
	       
	        c1.makeSound();
	        c1.eat();

	}

}
