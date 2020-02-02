package javaexercise;
import java.util.Scanner;

public class PermutationString 
{

	public static void main(String[] args) 
	{
		Scanner input= new Scanner(System.in);
		String s= input.nextLine();
		input.close();
		PermutationString.permute(s,0,s.length()-1);

	}

	private static void permute(String s, int init, int length) 
	{
		if (init==length) 
		{
			System.out.print(s+" ");
		} else 
		{
			for (int j = init; j <= length; j++) 
			{
				s= swap(s,init,j);
				permute(s, init+1, length);
			}
		}
	}

	private static String swap(String s, int init , int j) 
	{
		char temp;
		char[] ch = s.toCharArray();
		temp= ch[init];
		ch[init]=ch[j];
		ch[j]=temp;		
		return String.valueOf(ch);
	}
}
