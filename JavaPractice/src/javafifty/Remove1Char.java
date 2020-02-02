package javafifty;

public class Remove1Char 
{
	//solution--1
	static String remove(String s,int index)
	{
		char[] ch=s.toCharArray();
		String str="";
		for (int i = 0; i < s.length(); i++) 
		{			
			if(i==index) 
			{
				str+=ch[i+1];
				i++;				
			}
			else
			{
				str+=ch[i];
			}
		}
		return str;
	}
	//solution--2
	static String remove1(String s,int index)
	{
		StringBuffer sb= new StringBuffer(s);
		sb=sb.delete(index, index+1);
		return sb.toString();
	}
	//solution--3
	static String remove2(String s,int index)
	{
		return s.substring(0, index)+s.substring(index+1);
	}
	
	static String remove3(String s, char c)
	{
		int index=0;
		for (int i = 0; i < s.length(); i++) 
		{
			char ch[]=s.toCharArray();
			if (c==ch[i]) 
			{
				index=i; break;
			}
		}
		return s.substring(0, index)+s.substring(index+1);
	}
	public static void main(String[] args) 
	{
		String s= "tanmaya kumar behera";
		String str=remove(s,8);
		System.out.println(str);
		System.out.println(remove1(s, 0));
		System.out.println(remove2(s, 8));
		System.out.println(remove3(s,'a'));
	}
}
