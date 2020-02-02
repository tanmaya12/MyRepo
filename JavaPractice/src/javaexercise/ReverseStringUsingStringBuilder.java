package javaexercise;

public class ReverseStringUsingStringBuilder 
{
	public static void main(String[] args) 
	{
		String s= "Tanmaya Kumar Behera";
		System.out.println(new StringBuilder(s).reverse().toString());
		System.out.println(rev(s));

	}

	private static String rev(String s) 
	{
		StringBuilder sb= new StringBuilder();
		for (int i = s.length()-1; i >=0; i--) 
		{
			sb.append(s.charAt(i));
		}
		return sb.toString();
	}
}
