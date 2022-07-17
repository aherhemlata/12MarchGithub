package logicalPrograms;

public class Example11_Find_Total_No_WhiteSpace 
{
	public static void main(String[] args)
	{
		String s1 ="aa b d bg bh";
		int count = 0;
		for(int i =0; i<s1.length()-1; i++)
		{
			char char1 = s1.charAt(i);
			if(char1 == ' ')
			{
				count++;
			}
			
		}
		
	System.out.println("The number of white spacese are : "+count);
	}
	

}
