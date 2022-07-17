package logicalPrograms;

import java.util.Scanner;

public class Example13_Fibonocciaseries 
{
	public static void main(String[] args) 
	{
		int num1 = 0;
		int num2 = 1;
		int sum;
		System.out.print("Enter how many numbers to print in fibonacci series: ");
		Scanner scan = new Scanner(System.in);
		int count =scan.nextInt();
		
		System.out.println("Fibonacci series is: ");
		System.out.print(num1 +" "+num2);
		
		for(int i =1; i<=count-2; i++)
		{
			sum = num1 + num2;
			num1 = num2;
			num2 = sum;
			System.out.print(" "+sum);
		}
		


		
	}
	
}
