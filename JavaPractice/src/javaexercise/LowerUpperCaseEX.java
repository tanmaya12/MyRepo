package javaexercise;

public class LowerUpperCaseEX {

	public static void main(String[] args) {
		String s="Welcome to brAodridgetrasdjfjhdfghfaaghg";// o/p= wELcomE TO broaDRIGE   aBBcccDDDDeeeeeFFFFFF
		s=s.toLowerCase();
		System.out.println(s);
		char[] ch= s.toCharArray();
		s="";
		System.out.println(s.length());
		int pos=0,i = 1;
				
		while(pos < ch.length)
		{
			for (int j = 0; j < i; j++) 
			{
				if(i%2==0)
				{	ch[pos]-=32; 
					s+=ch[pos];
				}else
				{ s+=ch[pos]; }
				
				pos++;
				
				if(pos==ch.length)
					break;
			}
			i++;
		}
		System.out.println(s);		
		
	}
	
	static void sol2_Collection(String s)
	{
		String[] a=null;
		int pos=0;
		while(pos<s.length())
		{
			for (int i = 0; i < s.length(); i++) 
			{
				a[pos]=s.substring(i, pos);
			}
			pos++;
		}
		
		
	}
	
	
	
	
	
	
	
	

}
