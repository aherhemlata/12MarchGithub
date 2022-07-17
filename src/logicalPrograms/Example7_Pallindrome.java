package logicalPrograms;

public class Example7_Pallindrome 
{
	public static void main(String a[])
	{
		String org = "sms";
		String rev = "";
		
		for(int i=org.length()-1;i>=0;i--)
		{
			rev = rev + org.charAt(i); 
		}
		
		if(org.equals(rev))
		{
			System.out.println("String Palindrome");
		}
		else
		{
			System.out.println("String is not Palindrome");
		}
	}

}
