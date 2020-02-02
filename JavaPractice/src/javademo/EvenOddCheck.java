package javademo;
import java.util.Scanner;

public class EvenOddCheck 
{
	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);	
		System.out.println("Enter a Number");
		int no= Integer.parseInt(s.nextLine());
		/*if (no%2==0) 
		{
			System.out.println(no+" is a Even no.");			
		} else 
		{
			System.out.println(no+" is a odd no.");
		}*/
		for (int i = 1; i <= no; i++) 
		{
			if (i%2==0){
				System.out.println("Even no.:"+ i);
				
			} 
//			else {
//				System.out.println("Odd no.:"+ i);
//			}
			
		}
		for (int i = 1; i <= no; i++)
			
		{
			if (i%2!=0)
			{
				System.out.println("Odd no.:"+ i);				
			}
		}
			

	}
}
