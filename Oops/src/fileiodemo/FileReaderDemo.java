package fileiodemo;

import java.io.FileReader;
import java.io.Reader;

public class FileReaderDemo {

	public static void main(String[] args) {
		try
        {
            Reader reader=new FileReader("d:/javatest/data.txt");
            
            int data=reader.read(); // return unicode value of character
            
            while(data!= -1) // -1 when stream ends
            {
                System.out.print((char) data);
                data=reader.read();
            }
            reader.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

	}

}
	


