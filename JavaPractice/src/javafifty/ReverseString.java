package javafifty;

public class ReverseString 
{
	static String rev1(String s) 
	{
		String str="";
		for (int i = s.length()-1; i >=0; i--) 
		{
			//char ch[]=s.toCharArray();
			//str+=ch[i];
			char ch= s.charAt(i);
			str+=ch;
		}
		return str;
	}
	static String rev2(String s) 
	{
		StringBuffer sb= new StringBuffer(s);
		return sb.reverse().toString();
	}
	public static void main(String[] args) 
	{
		String s= "tanmaya kumar behera";
		System.out.println(s);
		System.out.println(rev1(s));
		System.out.println(rev2(s));
	}

}
