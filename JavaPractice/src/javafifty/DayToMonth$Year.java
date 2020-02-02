package javafifty;
import java.util.Scanner;

public class DayToMonth$Year 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a no.:");
		Scanner s= new Scanner(System.in);
		int n= Integer.parseInt(s.nextLine());
		s.close();
		int year=0,month=0;
		if(n>=30)
		{
			while (n>=30) 
			{
				if (n>=365) 
				{
					n-=365; year++;
				}
				else if(n>=30)
				{
					n-=30; month++;
				}				
			}
			System.out.println(year+"years, "+month+"months & "+n+"days");
		}
			else
			{
				System.out.println(n+"days");
			}	
	}
}
