package fileiodemo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {

	public static void main(String[] args) {
		try {
            FileReader f=new FileReader("d:/javatest/names.txt");
            BufferedReader br = new BufferedReader(f);
            String line = "";
           
            while((line=br.readLine())!=null){
                System.out.println(line);
            }
            br.close();
           
        } catch (FileNotFoundException e) {
           
            System.out.println("File not exists or insufficient rights");
            e.printStackTrace();
           
        } catch (IOException e) {
            System.out.println("An exception occured while reading the file");
            e.printStackTrace();        }

	}

}
