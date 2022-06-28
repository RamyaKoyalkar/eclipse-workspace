package assingment5;

public class TestTollbooth {

	public static void main(String[] args) {
		Tollbooth booth =new Mytollbooth();
		Truck ford=new TruckFord(5,12500);      //5 axles and 12000 kg
        Truck nissan=new TruckNissan(2,5000);   //2 axles and 5000kg
        Truck daewoo=new TruckDaewoo(2,17000);  //6 axles and 17000kg
        
        System.out.println("Welcome to Allegheny Tollbooth");
       
        System.out.println("Arrival of Ford Truck");
        booth.calculateTollDue(ford.getAxles(),ford.totalweight());
        System.out.println();
        
        System.out.println("Arrival of Nissan Truck");
        booth.calculateTollDue(nissan.getAxles(),nissan.totalweight());
        System.out.println();
        
        System.out.println("Arrival of Daewoo Truck");
        booth.calculateTollDue(daewoo.getAxles(),daewoo.totalweight());
        System.out.println();
        
        System.out.println("**Collecting Reciepts**");
        booth.displayData();
        
        System.out.println("**Reset Reciepts**");
        booth.resetReciepts();
	}

}
