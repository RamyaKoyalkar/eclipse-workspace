package collectionsdemo;
//Comparable Interface is used to sort user defined objects based on single field -age
public class Student implements Comparable<Student> {
	int rollNo;
    String name;
    int age;
    
    //generate constructor using fields
	public Student(int rollNo, String name, int age) {
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Student o) {
		if(age==o.age)
	        return 0;
	        else if(age>o.age) // else if(age<o.age) // descending order
	            return 1;
	        else
	            return -1;
	}


  
}
