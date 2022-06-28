package assingmentstreamdemo;

import java.util.ArrayList;
import java.util.List;

public class NumberOfElements {

	public static void main(String[] args) {
		
		 List<Integer> numbers=new ArrayList<Integer>();
		    numbers.add(10);
		    numbers.add(6);
		    numbers.add(5);
            numbers.add(8);
		    numbers.add(9);

		    long cnt=numbers.stream().count();
		    numbers.stream().map(s -> s + " ").count();
		    System.out.println("No of Elements : "+cnt);
	}

}
