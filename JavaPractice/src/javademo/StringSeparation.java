package javademo;

public class StringSeparation 
{
	public static void main(String[] args) 
	{
		String s="b5@tans2m#$c3a%ku&*()!m0ar +=a";
		
		/*//solution--1
		String t1="";
		String t2="";
		String out="";
		for (int i = 0; i < s.length(); i++) 
		{
			char ch = s.charAt(i);
			if(Character.isLetter(ch))
			{				
				out+=ch;
			}
			else if(Character.isDigit(ch))
			{
				t1+=ch;
			}
			else
			{
				t2+=ch;
			}
		}
		out=out+t1+t2;
		System.out.println(s+"	length= "+s.length());
		System.out.println(out+"	length= "+out.length());*/
		//solution 2
		//StringBuffer sb= new StringBuffer(s);
		char ch[]= s.toCharArray();
		for (int i = 0,j=ch.length-1; i<ch.length||j>=0; i++,j--) 
		{
			//System.out.print(ch[i]);
			if ((!Character.isLetter(ch[i]))||(Character.isLetter(ch[j]))) 
			{
				char temp=ch[i];
				ch[i]=ch[j];
				ch[j]=ch[i];
			}
		}
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
			
		}
		//System.out.println(s);
		
	}
}
