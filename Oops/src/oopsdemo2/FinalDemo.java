package oopsdemo2;
final class Hello
{
    final void display()
    {
        System.out.println("This is a final Method");
    }
}
/*
class World extends Hello  // final classes cannot be extended
{
    // final methods cannot be overridden
    final void display()
    {
        System.out.println("This is a final Method");
    }
} */
public class FinalDemo {

	public static void main(String[] args) {
		final int  AGE=20;
        final float PI=3.142f;
        //AGE=30;  //compilation error-value of final variables can not be changed

	}

}
