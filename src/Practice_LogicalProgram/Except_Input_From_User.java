package Practice_LogicalProgram;

import java.util.Scanner;

public class Except_Input_From_User 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the 1st number:");
		int num1 = scan.nextInt();
		System.out.println("Enter the 2nd number");
		int num2= scan.nextInt();
		System.out.println("Addition  of two numbers is:"+(num1+num2));
		System.out.println("Substraction  of two numbers is:"+(num1-num2));
		System.out.println("Mutiplication  of two numbers is:"+(num1*num2));

	}

}
