package logicalPrograms;

import java.util.Scanner;

public class Example5_evenOddnumbers 
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number: ");
		
		int num = scan.nextInt();
		//long num = scan.nextLong();
		
		if((num % 2) == 0)
		{
			System.out.println("The given number is Even");
		}
		else
		{
			System.out.println("The given number is Odd");

		}
	}

}
