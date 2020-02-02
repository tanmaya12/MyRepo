package javafifty;

public class WordsOccuranceInString 
{
	public static void main(String[] args) 
	{
		String s1="tanmay kumar behera cabu tanmaya kumar cabu";
		String[] s=s1.split(" ");
		int count=0;
		for (int i = 0; i < s.length; i++) 
		{
			count=0;
			for (int j = 0; j < s.length; j++) 
			{
				if (s[i].equals(s[j])) 
				{
					count++;
				}
			}
			if (count>1) 
			{
				System.out.println(s[i]+" "+count);
			}
			
		}

	}

}
