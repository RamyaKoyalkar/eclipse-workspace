package fileiodemo;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamDemo {
		// java program to read byte data using InputStream class

		public static void main(String[] args) throws IOException {
			// TODO Auto-generated method stub
	InputStream input=new FileInputStream("i:/javatest/data1.txt");
	        
	        /*
	         * A data input stream enable an application read primitive 
	         * Java data types from an underlying input stream in a 
	         * machine-independent way(instead of raw bytes).

	 

	         */
	        DataInputStream inst=new DataInputStream(input);
	        
	        int count=input.available();
	        
	        byte[] ary=new byte[count];
	        
	        inst.read(ary);
	        for(byte bt:ary)
	        {
	            char k=(char) bt;
	            System.out.print(k+"-");
	        }

		}

	}
