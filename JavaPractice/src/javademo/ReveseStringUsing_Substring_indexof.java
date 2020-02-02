package javademo;
import java.util.Scanner;

public class ReveseStringUsing_Substring_indexof 
{
	private static String rev(String s)
	{
		String str= (s.charAt(s.length()-1)+rev(s.substring(0, s.length()-1)));
		return str;
	}
	public static void main(String[] args) 
	{
		//Scanner st= new Scanner(System.in);
		//System.out.println("Enter a string:");
		String s= "tanmaya"; //st.nextLine();
		/*int len= s.length();
		String s1="";
		for (int i = len-1; i >= 0; i--) 
		{
			 s1= s.charAt(i)+s.substring(i);
		}*/
		s= rev(s);
		System.out.println(s);
		

	}
}
