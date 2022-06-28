package oopsdemo1;
class Trainee
{
	void skills()
    {
        System.out.println("Trainee Skills Management System");
    }
   
    void skills(int id,String name)
    {
        System.out.println(id+" "+name);
    }
   
    void skills(int id,String name,String prgm)
    {
        System.out.println(id+" "+name+" "+prgm);
    }
   
    void skills(int id,String name,String prgm,String db)
    {
        System.out.println(id+" "+name+" "+prgm+" "+db);
    }
   
}
public class OverloadDemo1 {

	public static void main(String[] args) {
		Trainee t1=new Trainee();
		t1.skills();
		
		System.out.println("Trainee without skills");
		t1.skills(101,"Mike");
		
		System.out.println("Trainee with programming skills");
		t1.skills(102,"James","Java");
		
		System.out.println("Trainee with programming & Data base skills ");
		t1.skills(103,"Marry","Java","MYSQL");

	}

}
