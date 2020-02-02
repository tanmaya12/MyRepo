package javaexercise;

public class Pyramid 
{

	public static void main(String[] args) 
	{
		int n=5,k=n;
		for (int i = 1; i <=n ; i++) 
		{
			
			for (int j =k-1; j >= 1; j--) 
			{
				System.out.print(" ");				
			}
			k--;
			for (int j = 1; j <= i; j++) 
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

}
