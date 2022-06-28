package oopsdemo1;

class Honda extends Car
{
    public void hondaStart()
    {
        Engine heng=new Engine();  // Composition - Honda class fully dependent on Engine
        heng.startEngine();
    }
}

 

class Hyundai extends Car
{
    public void hyundaiStart()
    {
        Engine heng=new Engine();  // Composition - Honda class fully dependent on Engine
        heng.startEngine();
    }
}
public class CompositionDemo {

	public static void main(String[] args) {
		  Honda hondaCity =new Honda();
	       
	        hondaCity.setColor("Silver"); //car class methods
	        hondaCity.setMax_speed(180);    //car class methods
	       
	        System.out.println("*******Honda Car Details *********");
	        System.out.println(hondaCity.getColor() +" Color");//car class methods
	        System.out.println(hondaCity.getMax_speed()+" Speed");//car class methods
	       
	        hondaCity.hondaStart(); // Honda class method-- > call ENgine class method

	}

}
