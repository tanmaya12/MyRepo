package javafifty;
import java.util.Scanner;

public class SortArrayElement 
{
	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		int n=5;
		int[] nos = new int[n];
		System.out.println("Enter 5 nos:");
		for (int i = 0; i < nos.length; i++) 
		{
			System.out.println("Enter "+i+1);
			nos[i]=Integer.parseInt(s.nextLine());
			//System.out.println(nos[i]);
		}
		s.close();
		for (int i = 0; i < nos.length; i++) 
		{
			for (int j = i+1; j < nos.length; j++) 
			{
				if (nos[i]>nos[j]) 
				{
					int temp=nos[i];
					nos[i]=nos[j];
					nos[j]=temp;
				}
			}
		}
		System.out.println("Ascending order:");
		for (int i = 0; i < nos.length; i++) 
		{
			System.out.print(nos[i]+", ");
		}
		System.out.println("\nDescending order:");
		for (int i = nos.length-1; i >=0 ; i--) 
		{
			System.out.print(nos[i]+", ");
		}

	}
}
