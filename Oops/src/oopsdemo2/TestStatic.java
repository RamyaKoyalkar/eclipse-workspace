package oopsdemo2;

public class TestStatic {

	public static void main(String[] args) {
		// invoke static method even before creating obj
		Student.collegeChange();
		
		Student s1=new Student(101,"Mike");
        Student s2=new Student(102,"John");
        Student s3=new Student(103,"Mary");
       
        s1.display();
        s2.display();
        s3.display();
 

	}

}
