package javafifty;

public class StringReverse 
{
	public static void main(String[] args) 
	{
		String s= "tanmay";
		System.out.println(rev1(s));
		System.out.println(rev2(s));
		System.out.println(rev3(s));
		System.out.println(rev4(s));
		System.out.println(rev5(s));
	}
	
	static String rev1(String s)
	{
		return new StringBuffer(s).reverse().toString();
	}
	static String rev2(String s)
	{
		return new StringBuilder(s).reverse().toString();
	}
	static String rev3(String s)
	{
		String t="";
		for (int i = s.length()-1; i >=0; i--) {
			t=t+s.charAt(i);
		}
		return s=t;
	}
	static String rev4(String s)//without using 3rd variable
	{
		int l=s.length();
		for (int i = s.length()-1; i >=0; i--) {
			s=s+s.charAt(i);
		}
		return s=s.substring(l);
	}
	static String rev5(String s)
	{
		StringBuilder sb= new StringBuilder(s);
		for (int i = s.length()-1; i >=0; i--) {
			sb=sb.append(s.charAt(i));
		}
		return sb.substring(s.length()).toString();
	}
	
}
