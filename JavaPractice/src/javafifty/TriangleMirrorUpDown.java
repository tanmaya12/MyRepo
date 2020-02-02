package javafifty;

public class TriangleMirrorUpDown 
{
	public static void main(String[] args)
	{
		int n=5;
		int t=n;
		for (int i = 1; i <=n; i++) 
		{
			for (int j = 1; j <=t; j++) 
			{
				System.out.print(j);
			}
			t--;
			System.out.println();
		}		
		t=n-1;
		for (int i = 1; i <=n-1; i++) 
		{
			for (int j = 1; j <t-1; j++) 
			{
				System.out.print(j);
			}
			t++;
			System.out.println();
		}
	}
}

//12345
//1234
//123
//12
//1
//12
//123
//1234
//12345
