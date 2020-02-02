package javafifty;

public class ReplaceStringInsideString 
{
	public static void main(String[] args)
	{
		String s="tanmay kumar rkumarr behera kumar";
		System.out.println(s.replace("kumar", "cabu"));
		String s1=s.substring(13);
		System.out.println(s+"\n"+s1);
		s=s.replace(s1,s.substring(0, s1.length()));
		System.out.println(s);
	}
}
