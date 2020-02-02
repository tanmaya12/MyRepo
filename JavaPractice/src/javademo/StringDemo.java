package javademo;
import java.util.Scanner;

public class StringDemo 
{
	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter 2 Strings:");
		String s1= s.nextLine();
		String s2= s.nextLine();
		String s3,s4,s5,s6;
		System.out.println("Concat "+s1.concat(s2));
		System.out.println("compare "+s1.compareTo(s2));
		
	}
}
