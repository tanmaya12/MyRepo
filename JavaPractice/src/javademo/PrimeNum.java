package javademo;
import java.util.Scanner;

public class PrimeNum 
{
	public static void main(String[] args)
	{
		int num=0;
		Scanner s= new Scanner(System.in);
		/*System.out.println("Enter a no for prime:");
		int no= Integer.parseInt(s.nextLine());
		for (int i = 1; i < no; i++) 
		{
			int count=0;
			for (num=i; num>=1; num--) 
			{
				if (i%num==0)
				{
					count +=1;					
				}				
			}
			if(count==2)
			{
				System.out.print(i+" ");
			}
		}
		System.out.println("\nEnter a no for factorial:");
		int n= Integer.parseInt(s.nextLine());
		long fact=1;
		for (int i = 1; i < n+1; i++) {
			fact *=i;			
		}
		System.out.println("Factorial of "+n+" = "+fact);
		*/
		System.out.println("\nEnter a no for fibonacci:");
		int n1= Integer.parseInt(s.nextLine());
		long t1=0,t2=1;
		for (int i = 1; i <= n1; ++i) 
		{
			System.out.print(t1+" ");
			long sum= t1+t2;
			t1=t2;
			t2=sum;
		}
	}

}
