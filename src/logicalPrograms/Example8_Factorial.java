package logicalPrograms;

import java.util.Scanner;

public class Example8_Factorial 
{
	public static void main(String a[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = scan.nextInt();
		int fact =1;
		for(int i=num;i>=1;i--)
		{
			fact =fact * i;
		}
		System.out.println("facotorial of "+num+" is "+fact);
		
				
		
	}

}
