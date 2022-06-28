package assingment3;

import java.util.Scanner;

public class Area {
  private int length;
  private int breadth;
  Scanner scan =new Scanner(System.in);
  void input()
  {
	  System.out.println("Enter the length of rectangle:");
	  length=scan.nextInt();
	  System.out.println("Enter the length of rectangle:");
	  breadth=scan.nextInt();
  }
  public float area()
  {
	  float area=length*breadth;
	  return area;
	  
  }
}

 