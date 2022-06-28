package miscellaneous;

//Generic class with 2 parameters - Maps- Stores data in form of key & value pairs - Hashmap, TreeMap

public class Pair <T,U> {
   private T first;
   private U second;
   
//generate constructors using fields
   
 public Pair(T first, U second) {
	 this.first = first;
	 this.second = second;
}
 
//generate getters and setters
 
public T getFirst() {
	return first;
}

public void setFirst(T first) {
	this.first = first;
}

public U getSecond() {
	return second;
}

public void setSecond(U second) {
	this.second = second;
}
 
}
