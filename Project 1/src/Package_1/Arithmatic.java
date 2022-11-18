package Package_1;

public class Arithmatic {
	
	public int mul(int a, int b)
	{
		int c=a*b;
		return c;
	}
	
	public int sum(int x, int y)
	{
		int z=x+y;
		return z;
	}
	
	public int sub(int x1, int x2)
	{
		int x3=x1-x2;
		return x3;
	}
	
	public int div(int a1, int a2)
	{
		int a3=a1/a2;
		return a3;
	}
	public static void main(String args[])
	{
	Arithmatic ob=new Arithmatic();
	int mulresult=ob.mul(10,2);
    int sumresult=ob.sum(mulresult,2);
    int subresult=ob.sub(sumresult,2);
    int subresult1=ob.sub(subresult,2);
    int finalresult=ob.div(subresult1,2);
	System.out.println("FInal result is " +finalresult);
    }
    
}
