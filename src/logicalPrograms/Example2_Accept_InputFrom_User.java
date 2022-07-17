package logicalPrograms;

import java.util.Scanner;

public class Example2_Accept_InputFrom_User 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
	 System.out.println("Enter the String: ");
	 String s1=	scan.next();
	 System.out.println("String is: "+s1);
	 System.out.println("Size of String is: "+s1.length());
	 System.out.println("UpperCase of String is: "+s1.toUpperCase());
	 System.out.println("Index of M is: "+s1.indexOf('m'));
	 System.out.println("Char at index 4 is:"+s1.charAt(4));
	 System.out.println(s1.replace("Hemlata", "Viransh"));
	 
	 
	 
		
	}

}
