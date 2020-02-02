package javaexercise;

public class RepeatString 
{

	public static void main(String[] args) 
	{
		
		String str = " abcg";
		String repeated = repeat(str, str.length());

		System.out.println(repeated);
	}
	public static String repeat(String s, int n) 
	{
	    if(s == null) 
	    {
	        return null;
	    }
	    final StringBuilder sb = new StringBuilder(s.length() * n);
	    for(int i = 0; i < n; i++)
	    {
	        sb.append(s);
	    }
	    return sb.toString();
	}

	
}
