package logicalPrograms;

import java.util.Arrays;

public class Example4_String_Comparision
{
	public static void main(String[] args)
	{
		int a1[] = {10,30,50};
		int a2[] = {10,40,60};
		int a3[] = {10,30,50};
		int a4[] = {10,30,50,70};
		
		System.out.println(Arrays.equals(a1,a2));
		System.out.println(Arrays.equals(a1,a3));
		System.out.println(Arrays.equals(a2,a3));
		System.out.println(Arrays.equals(a3,a4));

	}

}
