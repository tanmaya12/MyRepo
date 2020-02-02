package javafifty;

public class Triangle$RevPrint 
{
	public static void main(String[] args) 
	{
		int n=5;
		int i,j,k;
		int t=n;
		for ( i = 1; i <=n; i++) 
		{
			for ( j = 1; j<=i; j++) 
			{
				System.out.print(j);
			}			
			for (j = t-1; j>0  ; j--) 
			{
				System.out.print(" ");
			}
			for (k = 1; k <=t; k++) 
			{
				System.out.print(k);
			}
			t--;
			System.out.println();
		}
	}
}
//1    12345
//12   1234
//123  123
//1234 12
//123451