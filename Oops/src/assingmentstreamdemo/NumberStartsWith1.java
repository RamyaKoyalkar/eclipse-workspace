package assingmentstreamdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NumberStartsWith1 {

	public static void main(String[] args) {
		
		 List<Integer> numbers=new ArrayList<Integer>();
	        numbers.add(10);
	        numbers.add(99);
	        numbers.add(17);
	        numbers.add(65);
	        numbers.add(199);
	        numbers.add(9);
	        
	        Stream<Integer> stream=numbers.stream(); 
	        System.out.println("Numbers Starting with 1");
	        numbers.stream().map(i -> i + " ").filter(i-> i.startsWith("1")).forEach(System.out::println);
	       

	}

}
