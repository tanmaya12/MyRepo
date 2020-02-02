package javaexercise;

public class RemoveCharInString 
{
	public static void main(String[] args) 
	{
		String s="tanmaya";
		StringBuilder sb= new StringBuilder(s);
		sb.deleteCharAt(3);
		System.out.println(sb.toString());
		System.out.println(removeChar(s, 2));
	}
	public static String removeChar(String s, int n)
	{
		String front= s.substring(0,n);
		String back=s.substring(n+1,s.length());
		return front+back;
	}
}
