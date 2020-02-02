package javafifty;
//Write a program to find sum of all integers greater than 100 and less than 200 that are divisible by 7?
public class SumOf100_200Divby7 
{
	public static void main(String[] args) 
	{
		int sum=0;
		for (int i = 101; i < 200; i++) 
		{
			if (i%7==0) 
			{
				sum+=i;
				//System.out.println(i);
			}
		}
		System.out.println("100<Sum%7<200 = "+sum);

	}
}
