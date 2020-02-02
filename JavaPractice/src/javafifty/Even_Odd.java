package javafifty;
import java.util.Scanner;

public class Even_Odd
{
	public static void main(String[] args)
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a natural no.: ");
		int n= Integer.parseInt(s.nextLine());
		s.close();
		if (n%2==0) 
		{
			System.out.println(n+" is an even no.");			
		} else {
			System.out.println(n+" is an odd no.");
		}

	}
}
