package Learn;

class Student{
	String name;
	int id;
	
	public Student(String name){
		this.name= name;
	}
	public Student(String name, int id){
		this.name = name;
		this.id =id;
	}
	@Override
	public boolean equals(Object obj) {
		Student studentArg = (Student)obj; 
		return(this.name==studentArg.name)|| (this.id==studentArg.id);
	}
	
}


public class EualsTest {
public static void main(String[] args) {
	Student s1 = new Student("Rakesh", 100); 
	Student s2 = new Student("Rakesh", 1);
	System.out.println(s1==s2);
	System.out.println(s1.equals(s2));
	
}

}
