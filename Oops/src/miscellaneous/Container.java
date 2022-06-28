package miscellaneous;

public class Container<T> {
   private T t;
     
   public void add(T t) {
       this.t = t;
    }



    public T get() {
       return t;
    }
   
	public static void main(String[] args) {
		Container<String> strContainer = new Container<String>();
		Container<Integer> intContainer = new Container<Integer>();
		Container<Double> dblContainer = new Container<Double>();
		Container<Character> chrContainer = new Container<Character>();
		
		strContainer.add("James Gossling");
		intContainer.add(1000);
		dblContainer.add(50000.55);
		chrContainer.add('A');
		
		System.out.println("The String value is : "+strContainer.get());
		System.out.println("The Integer value is : "+intContainer.get());
		System.out.println("The Double value is : "+dblContainer.get());
		System.out.println("The Character value is : "+chrContainer.get());
	}

}
