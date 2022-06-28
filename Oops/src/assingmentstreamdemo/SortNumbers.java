package assingmentstreamdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class SortNumbers {

	public static void main(String[] args) {
		
		List<Integer> numbers=new ArrayList<Integer>();
		numbers.add(100);
		numbers.add(6);
		numbers.add(54);
		numbers.add(17);
		numbers.add(94);
		numbers.add(9);
        
        Stream<Integer> stream=numbers.stream(); 
        System.out.println("****Elements after sorting****");
        numbers.stream().sorted().forEach(System.out::println);
	}

}
