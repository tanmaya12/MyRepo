package string;

interface RevString
{
	String rev_Lamda(String s);
}
public class StringReverse {

	public static void main(String[] args) {
		String s="345ndbjd tanmay";
		System.out.println(rev_StringBuffer(s));
		System.out.println(rev_JavaTemp(s));
		System.out.println(rev_WithoutTemp(s));
		System.out.println(rev_toCharArray(s));
		
		RevString sr= (String s1)->{
			return new StringBuffer(s1).reverse().toString();
		};
		
		System.out.println(sr.rev_Lamda(s));
		
	}
	static String rev_StringBuffer(String s)//same as StringBuilder
	{
		return new StringBuffer(s).reverse().toString();
	}
	static String rev_JavaTemp(String s)
	{
		String temp="";
		for (int i = s.length()-1; i >=0 ; i--) {
			char ch= s.charAt(i);
			temp+=ch;			
		}
		return temp;
	}
	static String rev_WithoutTemp(String s)
	{
		int n=s.length();
		for (int i = s.length()-1; i >=0 ; i--) {
			char ch= s.charAt(i);
			s+=ch;			
		}
		return s.substring(n,s.length());
	}
	static String rev_toCharArray(String s)
	{
		int n=s.length();
		char[] ch= s.toCharArray();
		for (int i = ch.length-1; i >=0 ; i--) {
			s+=ch[i];			
		}
		return s.substring(n,s.length());
	}
	

}
