package assingmentstreamdemo;

import java8features.NumericTest;

interface Checkprime {
    public boolean prime(int tmp);
}
 
public class LambdaExample {

	public static void main(String[] args) {
		NumericTest isOdd=(n) -> (n%2==1);
		System.out.println("The number is Odd Number: "+isOdd.computeTest(7));
		
		NumericTest isPrime = ((num) -> {
            int n = (int) Math.sqrt(num);
            for(int i=2;i<=n;i++)
                if(num%i==0) 
                    return false;
            return true;
        });
		  System.out.println("the number is prime : "+isPrime.computeTest(6));

	}

}
