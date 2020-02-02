package javaexercise;
import java.util.Scanner;

public class ExcludeCommonIn2Strings 
{
	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter 1st i/p: ");
		String s1=s.nextLine();
		System.out.println("Enter 2nd i/p: ");
		String s2=s.nextLine();
		s.close();
		String temp=s1;
		for (int i = 0; i < s1.length();i++) 
		{			
			for (int j = 0; j < s2.length(); j++) 
			{
				if (s1.charAt(i)==s2.charAt(j)) 
				{
					s1=s1.replace(s1.charAt(i), ' ');
					break;
				}
			}
		}
		s1=s1.replaceAll("\\s", "");
		for (int i = 0; i < s2.length();i++) 
		{			
			for (int j = 0; j < temp.length(); j++) 
			{
				if (s2.charAt(i)==temp.charAt(j)) 
				{
					s2=s2.replace(s2.charAt(i), ' ');
					break;
				}
			}
		}
		s2=s2.replaceAll("\\s", "");
		System.out.println("1st o/p: "+s1+"\n2nd o/p: "+s2);

	}
	public static String removeChar(String s, int n) 
	{		
		return s.substring(0,n)+s.substring(n+1,s.length());
	}
	
}
