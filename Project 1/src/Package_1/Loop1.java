package Package_1;

import java.util.Scanner;

public class Loop1 {
	
			public static void main(String[] args)
		
		{
			System.out.println("Please enter Marks");
			Scanner Obj=new Scanner(System.in);
			int a=Obj.nextInt();
			if((a>=0)&&(a<35))
			{
				System.out.println("Fail");
			}
			else if((a>=35)&&(a<60))
			{
					System.out.println("Pass");
			}
			else if((a>=60)&&(a<80))
			{
					System.out.println("Frst Division");
			}
			else if((a>=80)&&(a<100))
			{
					System.out.println("Excellent");
			}	
			else
			{
				System.out.println("Please enter correct Marks");
			}
		}
	}


