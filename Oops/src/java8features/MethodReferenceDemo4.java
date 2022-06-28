package java8features;

//Java program to use Method Reference to a Constructor
interface IMessage
{
 ConstructorReference getMessage(String msg);
}



class ConstructorReference
{
 ConstructorReference(String msg)
 {
     System.out.println(msg);
 }
 
}
public class MethodReferenceDemo4 {

	public static void main(String[] args) {
	   IMessage hello = ConstructorReference::new;	
	   hello.getMessage("Method Reference to Constructor");
	}

}
