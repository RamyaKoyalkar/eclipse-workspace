package java8features;

@FunctionalInterface
interface MyFI
{
	public String sayHello();  //by default abstract
    //public String sayHello1();
}
public class LambdaDemo1 {

	public static void main(String[] args) {
		MyFI msg= () -> { return "Hello World";};   //lambda expression
		System.out.println(msg.sayHello());
	}

}
