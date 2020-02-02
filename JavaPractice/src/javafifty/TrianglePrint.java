package javafifty;

public class TrianglePrint 
{
	public static void main(String[] args)
	{
		int n=5;
		int i,j;
		for ( i = 1; i<=n ; i++) 
		{			
			for ( j = 1; j <= i; j++) 
			{
				System.out.print(j);				
			}
			j--;
			for (int k = j-1; k>0 ; k--) 
			{
				System.out.print(k);
			}
			System.out.println("\n");
		}

	}
}
//1
//121
//12321
//1234321