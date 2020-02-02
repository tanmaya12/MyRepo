package javademo;
import java.util.Scanner;

public class CharDetect 
{
	public static void main(String[] args)
	{
		Scanner st= new Scanner(System.in);
		System.out.println("Enter a string:");
		String s= st.nextLine();
		int len=s.length(),dcount=0,spcount=0,vcount=0;
		String v="aeiou",d="0123456789",spchar=" ";
		for (int i = 0; i < len; i++) 
		{
			char ch= s.charAt(i);
			if(Character.isDigit(ch))
			{
				dcount++;
			}
			if(Character.isWhitespace(ch)) 
			{
				spcount++;				
			} else
			{
				for (int j = 0; j < v.length(); j++) 
				{
					char vw= v.charAt(j);
					if(vw==ch)
					{
						vcount++;
					}
				}
			}
		}
		if (dcount>0) 
		{
			System.out.println("digit present.");
			
		} if(spcount>0)
		{
			System.out.println("Whitespace present");
		} if(vcount>0) 
		{
			System.out.println("vowel present");
		}
		else {
			System.out.println("No vowel,no digit& no space");
		}
		
	}
}
