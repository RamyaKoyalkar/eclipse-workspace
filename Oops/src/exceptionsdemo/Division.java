package exceptionsdemo;

import java.util.Scanner;
//program to perform division of two nos without exception
public class Division {

	public static void main(String[] args) {
		int a, b, result;
        Scanner input = new Scanner(System.in);
       
         System.out.println("Input two integers");
         a = input.nextInt();
         b = input.nextInt();  // enter 0
        
        result = a / b;  // JRE Throws Arithmetic exception
       
        System.out.println("Result = " + result);
        input.close();

	}

}
