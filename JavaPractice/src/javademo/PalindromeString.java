package javademo;
import java.util.Scanner;

public class PalindromeString 
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a string:");
		String str= s.nextLine(),str1="";
		int len= str.length();//count=0;
		/*char c,d;
		for (int i = len-1,j=0; (i >=0)||(j<len); i--,j++) 
		{
			c=str.charAt(j);
			d=str.charAt(i);
			if(c==d)
			{
				count++;
			}
		}
		if(count==len)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
*/
		for (int i = len-1; i >=0; i--) 
		{
			str1=str1+str.charAt(i);
		}
		if(str.equalsIgnoreCase(str1))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}

	}
}
