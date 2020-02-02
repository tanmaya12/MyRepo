package javafifty;
import java.util.Scanner;

public class VowelsCount 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a word: ");
		Scanner s= new Scanner(System.in);
		String str= s.nextLine();
		s.close();
		int count=0;
		for (int i = 0; i < str.length(); i++) 
		{
			char ch= str.charAt(i);
			if (ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
			{
				count++;
			}
		}
		System.out.println("No. of vowels= "+count);
	}
}
