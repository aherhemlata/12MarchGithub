package Practice_LogicalProgram;

import java.util.Scanner;

public class Multipy_Using_Addition 
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 1st number:");
		int num1=scan.nextInt();
		System.out.println("Enter 2nd number:");
		int num2=scan.nextInt();
		int sum=0;
		for(int i=1;i<=num2;i++)
		{
			sum =sum + num1;
		}
		System.out.println("Multipication of two number is:" + sum);
	}

}
