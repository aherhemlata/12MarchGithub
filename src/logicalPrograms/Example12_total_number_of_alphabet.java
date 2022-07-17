package logicalPrograms;

public class Example12_total_number_of_alphabet 
{
	public static void main(String[] args) 
	{
		String s1 ="3461235676745846";
		int count = 0;
		for(int i =0; i<=s1.length()-1; i++)
		{
			char char1 = s1.charAt(i);
			if(char1 == '6')
			{
				count++;
			System.out.println(s1.charAt((i-1)));
			}
			
		}
		System.out.println("Total no of 6 is "+count);

				
	}

}
