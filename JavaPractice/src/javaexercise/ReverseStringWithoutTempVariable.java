package javaexercise;

public class ReverseStringWithoutTempVariable 
{
	public static void main(String[] args) 
	{
		String s= "tanmaya kumar?  uujw234@";
		
		//1st way
		for (int i = s.length()-1; i >=0; i--) 
		{
			s+=s.charAt(i);
		}		
		s=s.substring(s.length()/2);
		System.out.println(s);
		
		//2nd way re-reverse
		for (int i = 0; i < s.length(); i++) 
		{
			s=s.substring(1, s.length()-i)+s.charAt(0)+s.substring(s.length()-i);
		}
		System.out.println(s);

	}

}
