package javademo;
import java.util.Scanner;

public class TrianglePeriramid
{
	public static void main(String[] args) 
	{
//		Scanner s= new Scanner(System.in);
//		System.out.println("Enter a no.:");
		//int num= Integer.parseInt(s.nextLine());		
		for (int i = 5; i >= 1; i--) 
		{	
			//int count=5;
			for (int j = i; j>=1; --j) 
			{
				System.out.print(i); //(count);
				//count-=1;
			}
			System.out.print("\n");
		}

	}

}
