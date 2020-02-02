package javafifty;
import java.util.Scanner;

public class LeapYear 
{
	public static void main(String[] args) 
	{		
		System.out.println("Enter a year: ");
		Scanner s=new Scanner(System.in);
		int yr= Integer.parseInt(s.nextLine());
		s.close();
		/*if (yr%4==0) 
		{
			if (yr%100==0) 
			{
				if (yr%400==0) 
				{
					System.out.println("Leap year");
				}
				else
				{
					System.out.println("Not Leap year");
				}
			} 
			else 
			{
				System.out.println("Leap year");
			}			
		} */
		if(yr%4==0 && yr%100 !=0)
		{
			System.out.println("Leap year");
		}
		else if(yr%4==0 && yr%100 ==0 && yr%400==0)
		{
			System.out.println("Leap year");
		}		
		else 
		{
			System.out.println("Not Leap year");
		}
	}
}
