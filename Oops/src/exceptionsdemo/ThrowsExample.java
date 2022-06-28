package exceptionsdemo;

import java.io.IOException;

public class ThrowsExample {
	void myMethod(int a) throws IOException,ArithmeticException 
    {
        if(a==1)
            throw new IOException("IO Exception Ocurred");
        else
            throw new ArithmeticException("Arithmetic Exception");
    }

	public static void main(String[] args) {
		ThrowsExample t=new ThrowsExample();
		try
		{
			t.myMethod(22);
		}
		catch(Exception ex)
        {
            System.err.println(ex);
        }
	}

}
