package javaexercise;
import java.util.Scanner;

public class PrimeNoLeastExcuTime {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter no:");
		int no= Integer.parseInt(s.nextLine());
		int count=0, i=2;
		s.close();
		while(count<=1 && no!=i)
		{
			if(no%i==0)
			{
				count++;
			}
			i++;
		}
		if(count>=1)
		{
			System.out.println("not prime");
		}
		else
		{
			System.out.println("prime");
		}

	}

}
