package assingment5;

public class Mytollbooth implements Tollbooth {
	
	int truckcollection;
	int receiptcollection;
	int tolldue;
	
	@Override
	public void calculateTollDue(int axles, int totalWeight) {
		
		tolldue = 5*axles + 10*(totalWeight/500);
		System.out.print("Truck arrival-axles: "+axles+" Total Weight: "+totalWeight+" Toll Due: $"+tolldue+"");
	    System.out.println();
		
	    truckcollection=truckcollection+1;
	    receiptcollection=receiptcollection+tolldue;
		
	}
	@Override
	public void displayData() {
		System.out.print("Total since last collection-Receipts: ");
		System.out.print("$"+receiptcollection);
		System.out.print(" Trucks: ");
		System.out.println(truckcollection);
		
	}
	@Override
	public void resetReciepts() {
		truckcollection=0;
		receiptcollection=0;
		System.out.print("Total since last collection-Receipts: ");
		System.out.print("$"+receiptcollection);
		System.out.print(" Trucks: ");
		System.out.println(truckcollection);
		
		
	}
	
	  
}
	   
