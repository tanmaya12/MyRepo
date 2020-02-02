package javafifty;
//Count No. of words in a sentence
public class CountWords 
{
	public static void main(String[] args) 
	{
		String s= "This is my! java . program ! in my a pc ?";
		int count=0;
		String[] str=s.split(" ");
//		for (String string : str) 
//		{
//			System.out.println(string+" Length= "+ string.length());			
//		}
		for (int i = 0; i < str.length; i++) 
		{
			System.out.println(str[i]);
			if (str[i].length()==1) 
			{
				if(str[i].contains("?")||str[i].contains("!")||str[i].contains("."))
				{
					count++;
				}
			}
		}
		int n=str.length;
		System.out.println("No. of words= "+(n-count));
	}
}
