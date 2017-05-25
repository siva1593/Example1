//Introduction: lab 1
class Student{
	public Student() {
		// TODO Auto-generated constructor stub
	System.out.println("Default");
	}
	
	Student(int j)
	{
		this();
		System.out.println("Parameterized");
	}
	
	void display()
	{
		System.out.println("Non-Static Method");
	}
}
public class Program {

	public static void main(String[] args) {

		System.out.println("Main Method");
		new Student(10).display();
	}

} 

