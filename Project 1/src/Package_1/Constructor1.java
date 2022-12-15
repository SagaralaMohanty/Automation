package Package_1;

public class Constructor1 {
	
	public Constructor1()
	{
		this(22,23,24,26);
		System.out.println("Default Constructor");
	}
	public Constructor1(int a)
	{
		this();
		System.out.println("One Parameterized Constructor");
	}
	public Constructor1(int a, int b)
	{
		this(24,25,26);
		System.out.println("Two Parameterized Constructor");
	}
	public Constructor1(int a, int b, int c)
	{
		this(24);
		System.out.println("Three Parameterized Constructor");
	}
	public Constructor1(int a, int b, int c, int d)
	{
		
		System.out.println("Four Parameterized Constructor");
	}

	public static void main(String args[])
   {
		Constructor1 obj1=new Constructor1(22,23);
		
   }



}
