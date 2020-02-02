package javademo;
import java.util.Scanner;

public class CharDetectinString {

	public static void main(String[] args) 
	{
		Scanner st= new Scanner(System.in);
		System.out.println("Enter a string:");
		String s= st.nextLine();
		int len=s.length(),dcount=0,spcount=0,vcount=0;
		String v="aeiou",d="0123456789"; char sp=' ';
		for (int i = 0; i < len; i++) 
		{
			char ch= s.charAt(i);
			for (int j = 0; j < v.length(); j++) 
			{
				if(v.charAt(j)==ch)
				{
					vcount++;
				}
			}
			for (int j = 0; j < d.length(); j++) 
			{
				if(d.charAt(j)==ch)
				{
					dcount++;					
				}				
			}
			if(sp==ch)
			{
				spcount++;
			}
		}
		if (vcount>0)
		{
			System.out.println("Vowels present: "+vcount);			
		}
			if (dcount>0)
			{
				System.out.println("Digits present: "+dcount);			
			}
			if (spcount>0)
			{
				System.out.println("Space present: "+spcount);			
			}
			else
			{
				System.out.println("Non-Vowel prenst");
			}

	}

}
