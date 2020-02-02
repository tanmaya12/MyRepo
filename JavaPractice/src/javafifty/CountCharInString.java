package javafifty;
class CharOccurance
{
	public static int countChar(String s, char ch)
	{
		int count=0;
		for (int i = 0; i < s.length(); i++) 
		{
			char c=s.charAt(i);
			if(c==ch)
			{
				count++;
			}
		}
		return count;
	}
}

public class CountCharInString 
{
	public static void main(String[] args) 
	{
		String s= "tanmaya kumar behera";
		System.out.println("char no. of occurance= "+ CharOccurance.countChar(s, 'a'));
	}
}
