package fileiodemo;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileDemo {
		public static void main(String[] args) throws IOException {
			// TODO Auto-generated method stub
			Scanner reader = new Scanner(System.in);
	        boolean success = false;



	        System.out.println("Enter path of directory to create");
	        String dir = reader.nextLine();



	        File directory = new File(dir);
	        if (directory.exists()) {
	            System.out.println("Directory already exists ...");
	        } else {
	            System.out.println("Directory not exists, creating now");
	            success = directory.mkdir();
	            if (success) {
	                System.out.printf("Successfully created new directory : %s%n", dir);
	            } else {
	                System.out.printf("Failed to create new directory: %s%n", dir);
	            }
	        }



	        System.out.println("Enter file name to be created ");
	        String filename = reader.nextLine();



	        File f = new File(directory,filename);
	    //success =
	        if (f.exists()) {
	            System.out.println("File already exists");



	        } else {
	            System.out.println("No such file exists, creating now");
	            success = f.createNewFile();
	            if (success) { 
	                System.out.printf("Successfully created new file: %s%n", f);
	            } else {
	                System.out.printf("Failed to create new file: %s%n", f);
	            }
	        }
	        // close Scanner to prevent resource leak
	        reader.close();
	}

}
