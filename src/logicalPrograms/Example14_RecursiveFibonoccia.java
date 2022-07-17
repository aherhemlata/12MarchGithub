package logicalPrograms;

import java.util.Scanner;

public class Example14_RecursiveFibonoccia 
{
	public static void main(String[] args) 
	{
		System.out.print("How many number u want to enter in fibonocia series");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int i =0;i<n;i++)
		{
			System.out.print(fibinoccia(i)+" ");
		}
	}
	
	public static int fibinoccia(int n)
	{
		if(n==0)
			return 0;
		else if(n==1)
			return 1;
		else
			return (fibinoccia(n-1)+fibinoccia(n-2));
	}
}
