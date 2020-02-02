package javafifty;

public class Palindrome 
{
	//solution--1
	static void checkPalindrome(String s)
	{
		StringBuffer sb= new StringBuffer(s);
		if (sb.reverse().toString().equalsIgnoreCase(s))
		{
			System.out.println("Palendrome");
		} else {
			System.out.println("Not Palendrome");
		}
	}
	//solution--2
	static void checkPalindrome2(String s)
	{
		String str="";
		for (int i = s.length()-1; i >=0 ; i--) 
		{
			char ch=s.charAt(i);
			str+=ch;
		}		
		if (str.equalsIgnoreCase(s)) {
			System.out.println("Palendrome");
		} else {
			System.out.println("Not Palendrome");
		}
	}
	
	public static void main(String[] args)
	{
		String s1= "abcd";
		checkPalindrome(s1);
		checkPalindrome("ABCbA");
		checkPalindrome2("ABCbA");
		checkPalindrome2(s1);
	}
}
