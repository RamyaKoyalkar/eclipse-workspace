package fileiodemo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {

	public static void main(String[] args) {
	   //writing to a file using Buffered Writer in java
		try { 
	        // Creating Writer obj in Append mode -true
	        FileWriter writer = new FileWriter("d:/javatest/names.txt",true); 
	        BufferedWriter bwr = new BufferedWriter(writer);  
	        
	        
	        bwr.write("MIke Jordan"); 
	        bwr.write("\n"); // bwr.newLine();
	        bwr.write("Mary Singh");
	        bwr.write("\n");
	        bwr.close(); 

	 

	        System.out.println("succesfully written to a file"); } 
	        catch (IOException ioe) { 
	        ioe.printStackTrace(); 

	 

	    }

	}

}
