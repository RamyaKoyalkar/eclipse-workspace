package exceptionsdemo;
//General Exception Handling
public class ExceptionDemo {

	public static void main(String[] args) {
		String languages[] = { "C", "C++", "Java", "Perl", "Python" };
	       
        try
        {
            for(int i=0;i<=5;i++)
            {
                System.out.println(languages[i]);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
 
	}

}
