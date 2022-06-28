package oopsdemo2;
/*The major use of abstract classes and methods is to achieve abstraction in Java.
Abstraction is an important concept of object-oriented programming that allows us
to hide unnecessary  details and only show the needed information. */

public abstract class Bike {
	//generate implicit constructor
		public Bike() {
			// TODO Auto-generated constructor stub
		System.out.println("bike is created");
		}
		abstract void run();//abstract method
			void changeGear() {
				System.out.println("gear changer");
			}
		}
		class Honda extends Bike{

			@Override
			void run() {
				// TODO Auto-generated method stub
				System.out.println("honda bike is runninggg.....");
			}
			
		}


