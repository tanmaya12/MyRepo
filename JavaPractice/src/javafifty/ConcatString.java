package javafifty;

public class ConcatString 
{
	static String concatString(String s1, String s2)
	{
		for (int i = 0; i < s2.length(); i++) 
		{
			char ch[]=s2.toCharArray();
			s1+=ch[i];
		}
		return s1;
	}
	public static void main(String[] args) 
	{
		String s1="Tanmaya ";
		String s2="Kumar";
		
		
		System.out.println(concatString(s1, s2));
	}
}
  