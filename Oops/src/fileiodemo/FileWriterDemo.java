package fileiodemo;

import java.io.FileWriter;
import java.io.Writer;
import java.io.IOException;

public class FileWriterDemo {
//program to create a text based file
	public static void main(String[] args) {
		try
        {
            Writer w=new FileWriter("d:/testing/data.txt");
            String content="She Sells Sea Shells In the Sea.";
           
            w.write(content); // write contents into file
           
            w.close();
            System.out.println("Character Data Written to File");
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
	}

}
