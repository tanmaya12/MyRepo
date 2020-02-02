package javaexercise;

public class CharacterOccuranc 
{
	public static void main(String[] args) 
	{
		String s= "WELCOME";
		int count;
		char[] ch= s.toCharArray();
		for (int i = 0; i < s.length(); i++) 
		{	
			count=0;
			for (int j = 0; j < s.length(); j++) 
			{				
				if (s.charAt(i)==s.charAt(j))
				{
					count++;					
				}
			}
			if (count>=2) 
			{
				System.out.println(ch[i]);
			}
		}
	}
}
