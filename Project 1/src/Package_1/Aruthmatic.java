package Package_1;

public class Aruthmatic {
	
	public int sum(int a,int b)
	
	{
		int c=a+b;
		System.out.println("Sum result is " +c);
		return c;
	}
	public int sub(int x,int y)
	{
		int z=x-y;
		System.out.println("Substraction result is " +z);
		return z;
	}
	public int mul(int a1,int a2)
	{
		int a3=a1*a2;
		System.out.println("Multiplication result is " +a3);
		return a3;
		}
	public void div(int b1,int b2)
	{
	int b3=b1/b2;
	System.out.println("Final result is " +b3);
	}
	public static void main(String args [])
	{
		Aruthmatic Sag= new Aruthmatic();
		int sumresult=Sag.sum(10,2);
		int sumresult1=Sag.sum(sumresult, 2);
		int subresult=Sag.sub(sumresult1,2);
		int mulresult=Sag.mul(subresult,2);
		Sag.div(mulresult,2);
		
	}
		
		
	}
	

