package javafifty;
import java.util.Scanner;

public class SumOfDigitsInNo 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a no.:");
		Scanner s= new Scanner(System.in);
		int no=  Integer.parseInt(s.nextLine());//123
		s.close();
		int sum=0;
		while(no!=0)
		{
			sum+=no%10;//sum=sum+no%10;
			no/=10;//no=no/10;
			System.out.println(sum+" "+no);
		}
		if(sum>0)
			System.out.println(sum);
		else
			System.out.println(-sum);
	}
}
