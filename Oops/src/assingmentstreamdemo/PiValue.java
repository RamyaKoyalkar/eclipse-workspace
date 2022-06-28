package assingmentstreamdemo;

@FunctionalInterface
interface MyFI
{
	public String piValue();  //by default abstract
}

public class PiValue {

	public static void main(String[] args) {
		MyFI msg= () -> { return "3.141";};   //lambda expression
		System.out.println("The value of pi is"+msg.piValue());

	}

}
