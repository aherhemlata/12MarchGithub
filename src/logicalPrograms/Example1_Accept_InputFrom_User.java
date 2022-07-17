package logicalPrograms;

import java.util.Scanner;

public class Example1_Accept_InputFrom_User 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter num1:");
		// Accept input from User
		int num1 = scan.nextInt();
		
		System.out.println("Enter num2:");
		// Accept input from User
		int num2 = scan.nextInt();
	
		System.out.println("Addition of two number is: "+(num1+num2));
	}

}
