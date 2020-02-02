package javademo;

public class FundaTypeCast 
{
	public static void main(String[] args) 
	{
		for (int i = 0; i <= 255; i++)
		{
			char c= (char) i;//explicit type casting
			System.out.println(i+" = "+c);
		}
		for (char c = 'A'; c < '{'; c++) 
		{
			int i=c;//=(int)c   implicit type casting
			System.out.println(c+" = "+i);			
		}

	}
}
