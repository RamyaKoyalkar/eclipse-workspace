package assingment3;

import java.util.Scanner;

public class Room {
   private int roomNo;
   private String roomType;
   private float area;
   private boolean acMachine;
   Scanner scan=new Scanner(System.in);
   
   void setData()
   {
	 System.out.println("Enter the room no,room type,room area,ac machine:"); 
	 roomNo=scan.nextInt();
	 roomType=scan.next();
	 area=scan.nextFloat();
	 acMachine=scan.nextBoolean();
   }
   void displayData()
   {
	   System.out.println("The room number is:"+roomNo);
	   System.out.println("The room type is:"+roomType);
	   System.out.println("The room area is:"+area);
	   String s=(acMachine)?"Yes":"No";
	   System.out.println("Is there is a ac machine:"+s);
   }
   
}
