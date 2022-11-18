package Package_1;

public class Student {
	
	int roll,age;
	
	
	public void display()
	{
		System.out.println("Welcome to all of you");
		
	}
	public void display1()
	{
		System.out.println("automation is very easy");
	}
	public static void main(String args [])
	{
	Student Sagar = new Student();
	Sagar.display();
	Sagar.display1();
	Sagar.roll=27;
	Sagar.age=28;
	System.out.println("Roll Number is " + Sagar.roll);
	System.out.println("Roll Number is " + Sagar.age);
	
	}
}
