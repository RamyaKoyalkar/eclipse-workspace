package assingmentstreamdemo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CalculationUsingStreams {

	public static void main(String[] args) {
		List<Integer> num=new ArrayList<Integer>();
		num.add(1);
		num.add(45);
		num.add(55);
		num.add(7);
		num.add(94);
		num.add(21);
		
		num.stream() 
	    .max(Comparator.comparing(i -> i)) 
	    .ifPresent(max -> System.out.println("Maximum found is " + max));
		
		num.stream() 
	    .min(Comparator.comparing(i -> i)) 
	    .ifPresent(min -> System.out.println("Minimum found is " + min));
		
		int sum = num.stream() 
			    .mapToInt(i -> i) 
			    .sum();
			    System.out.println("Sum is " + sum);
		
		num.stream() 
	    .mapToInt(i -> i)
	    .average() 
	    .ifPresent(avg -> System.out.println("Average found is " + avg));

	}

}
