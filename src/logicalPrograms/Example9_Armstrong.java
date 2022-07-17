package logicalPrograms;

public class Example9_Armstrong 
{
	public static void main(String args[])
	{
		
		int orgnum = 371;
		int sum = 0;
		for(int i=orgnum;i>0;i=i/10)
		{
			int rem = i % 10;
			sum = sum + (rem * rem * rem);
			
		}	
		
	// For four digit armstrong nu	
/*		int orgnum = 8208;
		int sum = 0;
		for(int i=orgnum;i>0;i=i/10)
		{
			int rem = i % 10;
			sum = sum + (rem * rem * rem * rem);
			
		}*/
		if (orgnum ==sum)
		{
			System.out.println("The number is armstrong");
		}
		else
		{
			System.out.println("The number is not armstrong");
		}
		
	}

}
