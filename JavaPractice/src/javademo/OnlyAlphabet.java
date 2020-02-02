package javademo;
import java.io.IOException;
import java.util.Scanner;

public class OnlyAlphabet 
{
	public static void main(String[] args) throws IOException 
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a char fo check it is alphabet or not:");
		//char ch= s.next().charAt(0);
		char ch= (char)System.in.read();
		if (Character.isAlphabetic(ch))
		{
			System.out.println(ch+" is alphabet.");
		}
		else
		{
			System.out.println(ch+" is not alphabet.");
		}
		

	}
}
