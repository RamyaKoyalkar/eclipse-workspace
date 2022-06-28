package assingmentstreamdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EvenNumber {

	public static void main(String[] args) {
		
		 List<Integer> number=new ArrayList<Integer>();
	        number.add(99);
	        number.add(94);
	        number.add(5);
	        number.add(14);
	        number.add(21);
	        number.add(6);
	        
	      //Build stream from Collections
	      Stream<Integer> strm=number.stream();  
	      List<Integer> evenNumber=strm.filter(i-> i%2==0).collect(Collectors.toList());
	      System.out.println("************** Even Numbers************");
	      System.out.println(evenNumber);
	 
	}

}
