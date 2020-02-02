package javafifty;

public class CountNonRepeatedCharINString 
{
	public static void main(String[] args) 
	{
		String s="tanmay kumar behera";//7
		int count=0, norep=0;
		for (int i = 0; i < s.length(); i++) 
		{
			char ch=s.charAt(i);
			count=0;
			for (int j = 0; j < s.length(); j++) 
			{
				char chj=s.charAt(j);
				if (ch==chj) 
				{
					count++;
				} 
			}			
			if(!(count>1))
			{
				norep+=1;
			}
		}
		System.out.println("non repeated char= "+norep);

	}
}
