package oopsdemo;
//Program to demonstrate constructors in Java
class Language
{
	private String s;
    private int version;
    Language() // Implicit //NO-Args constructor
    {
    	System.out.println("I am a Implicit Constructor");
    	s="Python";
    	System.out.println("Hello from:"+s);
    }
    Language(String lang)   //Parameterized constructor with 1-Args
    {
    	System.out.println("I am a paramterized  Constructor with one argument");
    	this.s=lang;
    	System.out.println("Hello from:"+s);
    }
    Language(String lang,int ver)  //Parameterized constructor with 2 Args
    {
    	System.out.println("I am a parameterized Constructor with two arguments");
    	this.s=lang;
    	this.version=ver;
    	System.out.println("Hello from:" + s +" V."+version);
    }
}

public class LanguagesDemo {

	public static void main(String[] args) {
       Language l1=new Language(); //automatically invokes implicit constructor
       Language l2= new Language("Ruby");
       Language l3=new Language("Scala");
       Language l4=new Language();
       Language l5=new Language("Java",2);
	}

}
