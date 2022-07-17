package logicalPrograms;

public class Example6_ReverseString 
{
	public static void main(String[] args) 
	{
		String org = "Yogesh";
		String rev = "";
		for(int i =org.length()-1;i>=0;i--)
		{
			rev = rev + org.charAt(i);
		}
		System.out.println("Original String is : "+org);
		System.out.println("Reversed String is : "+rev);
	}

}
