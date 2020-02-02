package javafifty;
import java.util.Scanner;

public class PrimeNo 
{
	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a natural no.: ");
		int n = Integer.parseInt(s.nextLine());
		s.close();
		int count=1;
		if (n==1||n==0) {
			System.out.println("1/0 is no prime");
		}
		for (int i = 2; i <=n-1; i++) 
		{
			if (n%i==0) 
			{
				count++; break;
			}
		}
		if (count>1) 
		{
			System.out.println("Not Prime");
		} else {
			System.out.println("Prime");
		}
	}
}
