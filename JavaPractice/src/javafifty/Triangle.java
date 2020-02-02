package javafifty;

public class Triangle 
{
	public static void main(String[] args)
	{
		int n=5;
		int j,t=n,k=1;
		for (int i = 1; i <= n; i++) 
		{
			t--;
			for (int l = t; l >0; l--) 
			{
				System.out.print(" ");
			}
			
			for (j = 1; j <= i; j++) 
			{
				System.out.print(k);
				k++;
			}
			System.out.println();
		}
	}
}
//    1
//   23
//  456
// 78910
//1112131415